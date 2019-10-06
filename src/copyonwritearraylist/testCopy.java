package copyonwritearraylist;

public class testCopy {
    public static void main(String[] args) throws InterruptedException{
        MyService myService = new MyService();

        ThreadA[] a = new ThreadA[100];
        for(int i = 0; i < a.length; i++){
            a[i]=new ThreadA(myService);
        }
        for(int i=0;i<a.length;i++){
            a[i].start();
        }

        Thread.sleep(1000);
        System.out.println(myService.list.size());
        System.out.println("可以获取随机值:" + myService.list.get(8));
    }
}
