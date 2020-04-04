package Test;

import java.util.Objects;

public class StaticClass {
    static {
        i = 0;
//        System.out.println(i);
    }
    static int i = 1;

    public static void main(String[] args) {
//        new StaticClass();
//        System.out.println(StaticClass.i);
//        System.out.println(new StaticClass().toString());
        People p1 = new People(10, "Tom");
        People p2 = new People(20, "Marry");
        StaticClass.testArgs(p1, p2);
    }

    @Override
    public String toString() {
        System.out.println(getClass());
        return getClass().getName();
    }

    public static void testArgs(People... args) {
        for (People p :
                args) {
            System.out.println(p.toString());
        }
    }
}

class People {
    private int age = 0;
    private String name = "";

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age &&
                name.equals(people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
