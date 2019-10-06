package service;

public class ThreadC extends Thread{

    private Service service;

    public ThreadC(Service service){
        super();
        this.service=service;
    }

    public void run(){
        service.testMethod();
    }

}
