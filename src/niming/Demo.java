package niming;

/**
 * 接口匿名内部类，简化代码的书写
 * 如果不是该种方法，那么还需要些继承父类的子类，使用次数少，麻烦
 */
//interface Person {
//    public void eat();
//}
//
//public class Demo {
//    public static void main(String[] args) {
//        Person p = new Person() {
//            @Override
//            public void eat() {
//                System.out.println("eating food!");
//            }
//
//        };
//        p.eat();
//    }
//}

/**
 * 抽象类的匿名内部类
 */

//abstract class Person {
//    public abstract void eat();
//}
//
//public class Demo {
//    public static void main(String[] args) {
//        Person p = new Person() {
//            public void eat() {
//                System.out.println("eat rice");
//            }
//        };
//        p.eat();
//    }
//}


/**
 * Thread和Runnable也可以实现匿名内部类
 */
public class Demo {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}