package product;

public class ThreadP extends Thread{//生产者

    private RepastService repastService;

    public ThreadP(RepastService repastService){
        super();
        this.repastService=repastService;
    }

    public void run(){
        repastService.set();
    }

}
