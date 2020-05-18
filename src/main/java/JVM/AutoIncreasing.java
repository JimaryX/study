package JVM;

import java.time.LocalDate;

/**
 * Integer 值在-128 ～ 127 之间，相同的值会使用同一个对象 所以 a == b 因为同一个对象所以为true
 */
public class AutoIncreasing {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
    }
}
