package product;

public class Run {
    public static void main(String[] args) throws InterruptedException{
        RepastService repastService = new RepastService();
        ThreadP[] p=new ThreadP[60];
        ThreadC[] c=new ThreadC[60];

        for(int i=0;i<60;i++){
            p[i] = new ThreadP(repastService);
            c[i]=new ThreadC(repastService);
        }
        Thread.sleep(2000);
        for(int i=0;i<60;i++){
            p[i].start();
            c[i].start();
        }

    }
}
