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

    public static <T extends GrandFather> void demo(T a) {
        ((GrandFather)a).shut();
    }

    public static void main(String[] args) {
        demo(new GrandSon());
    }
}

class GrandFather {
    public void shut() {
        System.out.println("GrandFather");
    }
}

class GrandSon extends GrandFather {
    public void shut() {
        System.out.println("GrandSon");
    }
}