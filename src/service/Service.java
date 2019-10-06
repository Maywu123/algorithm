package service;

import java.util.concurrent.Semaphore;

public class Service {

    private Semaphore semaphore = new Semaphore(3);//最多只允许1个线程在acquire和release之间，3的话三个并发
    //peimits>1时并不能保证线程安全，可能会吹西安脏数据

    public void testMethod(){
        try{
            semaphore.acquire();//得到一个许可
            System.out.println(Thread.currentThread().getName() + " begin time= " + System.currentTimeMillis());
            System.out.println(semaphore.availablePermits());

            Thread.sleep(5000);

            System.out.println(Thread.currentThread().getName() + " end time= " + System.currentTimeMillis());
            System.out.println(semaphore.availablePermits());
            semaphore.release();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
