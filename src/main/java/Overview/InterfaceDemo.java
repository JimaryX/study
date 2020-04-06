package Overview;

public class InterfaceDemo extends Father implements Demo, Demo2{

    @Override
    public void tryDoSomething() {

    }

    @Override
    public void getSomething() {

    }
}

interface Demo {
    default void tryDoSomething() {}; // 使用default关键字后就可以添加一个默认的方法体，实现接口也就不用重写此方法

    void getSomething();
}

interface Demo2 {
    default void getSomething() {};
}

abstract class Father {
    abstract void getSomething();
}