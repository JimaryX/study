package Test;

import java.util.Objects;

public class ExtandObject extends Father{
    public void sum() {
        System.out.println(super.id + super.number);
    }
    public static void main(String[] args) {
//        ExtandObject e = new ExtandObject();
//        Father f = new ExtandObject();
//        System.out.println(f instanceof ExtandObject);
//        Father f2 = (Father) e;
//        ExtandObject e2 = (ExtandObject) f;
        Person p = new Older();
//        p.drink(); // 只允许调用在类中声明的方法，因为Person抽象类中没有，所以无法调用，如同超类不能调用子类方法
        Father f1 = new Father();
        Father f2 = f1;
        System.out.println(f1.equals(f2));

        Objects.equals(f1, f2); // 如果 f1 和 f2 都为null 返回true， 只有一个为null 返回 false，都不为null 则调用f1.equals(f2)
    }
}

class Father {
    public int id = 1;
    public int number = 2;

    public void sum() {
        System.out.println(id + number);
    }
}

abstract class Person {
    public int age;
    public String name;

    public abstract void eat();
}

class Older extends Person{

    @Override
    public void eat() {
        System.out.println(super.age);
    }

    public void drink() {
        System.out.println("Drink a tin of cola");
    }
}