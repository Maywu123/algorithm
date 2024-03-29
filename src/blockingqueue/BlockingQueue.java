package blockingqueue;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueue {
        /**
         * 定义一个阻塞队列用来存储生产出来的商品
         */
        private LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        /**
         * 定义生产商品个数
         */
       private static final int size = 10;
        /**
         * 定义启动线程的标志，为0时，启动生产商品的线程；为1时，启动消费商品的线程
         */
        private int flag = 0;

        private class LinkBlockThread implements Runnable{
            public void run(){

                int new_flag = flag++;
                System.out.println("启动线程：" + new_flag);

                if(new_flag == 0){
                    for(int i = 0; i < size; i++){

                        int name = new Random().nextInt(255);
                        System.out.println("生产商品：" + name +"号");

                        try{
                            queue.put(name);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }

                        System.out.println("仓库中还有："+ queue.size() + "个");

                        try{
                            Thread.sleep(100);
                        }catch(InterruptedException e){
                         e.printStackTrace();
                        }
                    }
                }

                else{
                    for(int j = 0; j < size / 2; j++){
                        try{
                            int n = queue.take();
                            System.out.println("消费了" + n + "号商品");
                        }catch(InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("仓库中还剩" + queue.size() + "个");

                        try{
                            Thread.sleep(100);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }

                }
            }
        }


    public static void main(String[] args) {

        BlockingQueue bq = new BlockingQueue();
        LinkBlockThread linkBlockThread = bq.new LinkBlockThread();

        Thread thread1 = new Thread(linkBlockThread);
        Thread thread2 = new Thread(linkBlockThread);

        thread1.start();
        thread2.start();

    }
}
