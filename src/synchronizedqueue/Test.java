package synchronizedqueue;

import java.util.concurrent.SynchronousQueue;

public class Test {

    public static void main(String[] args) throws InterruptedException{
//        try{
//            SynchronousQueue queue=new SynchronousQueue();
//
//            System.out.println("Step1");
//            System.out.println("anyString");
//            System.out.println("Step2");//结果显示到这，便阻塞了。因为数据没有被其他线程拿走，所以便阻塞了
//            System.out.println(queue.take());
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        MyService myService=new MyService();
        ThreadTake take=new ThreadTake(myService);
        ThreadPut put=new ThreadPut(myService);

        take.start();
        Thread.sleep(2000);
        put.start();
    }
}
