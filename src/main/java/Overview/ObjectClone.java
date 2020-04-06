package Overview;

import java.util.Date;

/**
 * 只对自定义的ObjectClone类中的实例域的 time 进行clone只是浅克隆，其time的date还是指向clone之前的date，因此依旧可以通过time的clone
 * 进行修改 time，解决办法：1、给time的date返回时，也进行克隆
 *                       2、给Time类实现Cloneable接口，重写clone方法，进行深克隆，而不是直接(Object)super.clone()使用默认的clone
 */
public class ObjectClone {
    private Time time = new Time();
    private int version = 0;

    public Time getTime() throws CloneNotSupportedException {
        return (Time)time.clone();
    }

    public int getVersion() {
        return version;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClone obj = new ObjectClone();
        System.out.println(obj);

        obj.getTime().getDate().setTime(1000000200);
        System.out.println(obj);
    }

    @Override
    public String toString() {
        return "ObjectClone{" +
                "time=" + time +
                ", version=" + version +
                '}';
    }
}

class Time implements Cloneable{
    private Date date = new Date();

    public Date getDate() {
        return (Date) date.clone();
    }

    @Override
    public String toString() {
        return "Time{" +
                "date=" + date +
                '}';
    }

    @Override
    public Time clone() throws CloneNotSupportedException {
        return (Time) super.clone();
    }
}