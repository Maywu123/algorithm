package Singleton;

/**
 * 饿汉式，在加载这个类时就实例化对象。
 */
public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return singleton1;
    }
}
