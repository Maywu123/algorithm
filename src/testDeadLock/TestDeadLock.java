package testDeadLock;

import threadlocal.Test;

public class TestDeadLock {
    public static String str1 = "str1";
    public static String str2 = "str2";//如果等于“str1”,那么不会死锁。

    public static void main(String[] args){
        Thread a = new Thread( () -> {
                try{
            while(true){
                synchronized (TestDeadLock.str1){
                    System.out.println(Thread.currentThread().getName() + "锁住了str1");
                    Thread.sleep(1000);//一秒
                    synchronized (TestDeadLock.str2){
                        System.out.println(Thread.currentThread().getName() + "锁住了str2");
                    }
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    });

        Thread b = new Thread( () -> {
            try{
                while(true){
                    synchronized (TestDeadLock.str2){
                        System.out.println(Thread.currentThread().getName() + "锁住了str2");
                        Thread.sleep(1000);

                        synchronized (TestDeadLock.str1){
                            System.out.println(Thread.currentThread().getName() + "锁住了str1");
                        }
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        });


        a.start();
        b.start();
    }
}
