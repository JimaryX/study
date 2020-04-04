package JVM;

public class PassivReference {
    public static void main(String[] args) {
        System.out.println(Father.value);
    }
}

class Father {
    static {
        System.out.println("this is father");
    }

    public static int value = 10;
}

class Son extends Father {
    static {
        System.out.println("this is son");
    }
}
