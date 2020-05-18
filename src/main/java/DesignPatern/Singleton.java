package DesignPatern;

public class Singleton {
    /**
     * 饿汉式
     */
//    private static Singleton m_instance = new Singleton();
//
//    // 构造方法私有，保证外界无法直接示例化
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        return m_instance;
//    }

    /**
     * 懒汉式
     */
    private static Singleton _instance = null;

    private Singleton() {
    }

    synchronized public static Singleton getInstance() {
        if (_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }
}
