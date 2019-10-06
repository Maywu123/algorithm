package product;

public class ThreadC extends Thread{//消费者
    private RepastService repastService;

    public ThreadC(RepastService repastService){
        super();
        this.repastService=repastService;
    }

    public void run(){
        repastService.get();
    }
}
