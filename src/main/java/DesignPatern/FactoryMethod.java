package DesignPatern;

public class FactoryMethod {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factory(ConcreteProduct.class);
        /**
         * 继续业务处理
         */
    }
}

// 抽象工厂
interface Creator {
    public <T extends Product> T factory(Class<T> a);
}

// 抽象产品
interface Product {
    public void method1();

    public void method2();
}

// 具体工厂
class ConcreteCreator implements Creator {

    @Override
    public <T extends Product> T factory(Class<T> a) {
        Product product = null;
        try {
            product = (Product) Class.forName(a.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}

// 具体产品
class ConcreteProduct implements Product {

    @Override
    public void method1() {
        // 业务逻辑
    }

    @Override
    public void method2() {
        // 业务逻辑
    }
}
