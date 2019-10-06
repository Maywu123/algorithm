package userqueue;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Test {

    public static void main(String[] args){
        PriorityBlockingQueue queue=new PriorityBlockingQueue<UserInfo>();
        queue.add(new UserInfo(123));
        queue.add(new UserInfo(1366));
        queue.add(new UserInfo(12));
        queue.add(new UserInfo(36999));
        queue.add(new UserInfo(199));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
