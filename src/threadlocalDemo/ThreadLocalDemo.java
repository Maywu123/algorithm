package threadlocalDemo;

public class ThreadLocalDemo {
    public static void main(String[] args) {

        // 声明 ThreadLocal对象,每个ThreadLocal对象都不一样，要设置否则为空
        ThreadLocal<Boolean> mThreadLocal = new ThreadLocal<Boolean>();

        // 在主线程、子线程1、子线程2中去设置访问它的值
        mThreadLocal.set(true);

        System.out.println("Main " + mThreadLocal.get());

        new Thread("Thread#1"){
            @Override
            public void run() {
                mThreadLocal.set(false);
                System.out.println("Thread#1 " + mThreadLocal.get());
            }
        }.start();

        new Thread("Thread#2"){//空，若3也为空，则输出和2的一样
            @Override
            public void run() {
                System.out.println("Thread#2 " + mThreadLocal.get());//null,因为没有设置
            }
        }.start();

        new Thread("Thread#3"){
            @Override
            public void run() {
                mThreadLocal.set(true);
                System.out.println("Thread#2 " + mThreadLocal.get());//null,因为没有设置
            }
        }.start();
    }
}