package exchange;

import java.util.concurrent.Exchanger;

public class ThreadA extends Thread {

    private Exchanger<String> exchanger;

    public ThreadA(Exchanger<String> exchanger){
        super();
        this.exchanger=exchanger;
    }

    public void run(){
        try{
            System.out.println("在线程A中得到线程B的值=" + exchanger.exchange("   A"));
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
