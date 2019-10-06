package synchronizedqueue;

public class ThreadPut extends Thread {
    private MyService myService;

    public ThreadPut(MyService myService){
        super();
        this.myService=myService;
    }

    public void run(){
        for(int i=0;i<10;i++){
            myService.putMrthod();
        }
    }
}
