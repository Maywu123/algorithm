package synchronizedqueue;

import java.util.concurrent.SynchronousQueue;

public class MyService {
    public static SynchronousQueue queue=new SynchronousQueue();

    public void putMrthod(){
        try {

            String putString="angString" + Math.random();
            System.out.println("put= " + putString);
            queue.put(putString);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void takeMethod(){
        try {
            System.out.println("teke=" + queue.take());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
