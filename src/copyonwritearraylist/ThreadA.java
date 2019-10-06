package copyonwritearraylist;

public class ThreadA extends Thread{

    private MyService myService;

    public ThreadA(MyService myService){
        super();
        this.myService=myService;
    }

    public void run(){
        for(int i = 0; i < 100; i++){
            myService.list.add("anyString");
        }
    }


}
