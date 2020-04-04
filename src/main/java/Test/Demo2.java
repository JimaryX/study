package Test;

public class Demo2 {
    private static int total = 0;
    private int num = 100;

    public static void increase() {
        Demo2.total++;
    }

    public void decrease() {
        this.num--;
        Demo2.total++;
    }
}
