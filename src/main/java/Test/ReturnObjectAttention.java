package Test;

import java.time.LocalDate;
import java.util.Date;

public class ReturnObjectAttention {
    public static void main(String[] args) {
        Time test = new Time();
        System.out.println(test.toString());

        System.out.println(test.toString());
    }
}

class Time {
    private int number = 1;
    private LocalDate date = LocalDate.now();  // 如果为Date类型，通过getter获取后可以修改，不安全
    private Date newDate = new Date();

    public int getNumber() {
        return number;
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
