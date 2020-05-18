package Test;

import com.sun.tools.javac.code.TargetType;

import java.time.LocalDate;
import java.util.Date;


/**
 * 匿名内部类一定是跟在new的后面，用其隐含实现一个接口或一个类，没有类名，根据多态，我们使用其父类名。因为匿名内部类属于局部类，
 * 所以局部类的所有限制对其生效。匿名内部类是唯一一种无构造方法的类。匿名内部类在编译时，系统自动起名Out$1.class。如果一个对象
 * 编译时的类型是接口，那么其运行的类型为实现这个接口的类。
 */
public class ReturnObjectAttention {
    public static void main(String[] args) {
        Time time = new Time() {
            // 匿名内部类重写了Time 的getNumber方法，这就是为什么匿名内部类一定要是一个接口或者类
            @Override
            public int getNumber() {
                System.out.println("匿名内部类！");
                return 0;
            }
        };

        Time time2 = new Time() {
            // {{ 调用实现的类或接口方法 }} 可在 {{ }} 内部可以调用父类方法，{ } 内部重写方法
            {
                getTable();
                getNumber();
            }
            public void getTable() {
                System.out.println("自定义的方法可以在{{...}}内调用");
            }
            // 重写类或接口的方法
            @Override
            public int getNumber() {
                System.out.println("匿名内部类");
                return super.getNumber() + 10;
            }
        };

//        System.out.println(time.getNumber());
        System.out.println(time2.getNumber());
    }
}

class Time {
    private int number = 1;
    private LocalDate date = LocalDate.now();  // 如果为Date类型，通过getter获取后可以修改，不安全
    private Date newDate = new Date();

    public int getNumber() {
        System.out.println("原始");
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Time{" +
                "number=" + number +
                ", date=" + date +
                '}';
    }

    public Date getNewDate() {
        return (Date) newDate.clone(); // 可以利用返回克隆的对象，这样就无法修改类的变量了
    }
}
