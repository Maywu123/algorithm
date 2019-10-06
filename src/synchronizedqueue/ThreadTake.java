package synchronizedqueue;

public class ThreadTake extends Thread {
    private MyService myService;

    public ThreadTake(MyService myService){
        super();
        this.myService=myService;
    }

    public void run(){
        for(int i=0;i<10;i++){
            myService.takeMethod();
        }
    }
}
