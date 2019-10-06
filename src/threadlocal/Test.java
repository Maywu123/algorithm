package threadlocal;


/*结果，将main和thread0隔离开来
1
main
11
Thread-0
1
main
 */
public class Test {

    ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
    ThreadLocal<String> stringLocal = new ThreadLocal<String>();


    public void set() {
        longLocal.set(Thread.currentThread().getId());
        stringLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longLocal.get();
    }

    public String getString() {
        return stringLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final Test test = new Test();


        test.set();
        System.out.println(test.getLong());//这是main的
        System.out.println(test.getString());


        Thread thread1 = new Thread(){
            public void run() {
                test.set();
                System.out.println(test.getLong());
                System.out.println(test.getString());
            }
        };
        thread1.start();//这是thread的
        thread1.join();

        System.out.println(test.getLong());//这还是main的
        System.out.println(test.getString());

        String str="abc";
        System.out.println(str);
        str=str+"de";
        System.out.println(str);

    }
}
