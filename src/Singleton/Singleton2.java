package Singleton;

/**
 * 懒汉式，在调用取得实例方法是才实例化
 */
public class Singleton2 {
    private static Singleton2 singleton2 = null;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(singleton2 == null){
            synchronized(Singleton2.class) {//具有锁的懒汉式，双重判断
                if(singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
