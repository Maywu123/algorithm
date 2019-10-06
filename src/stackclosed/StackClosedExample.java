package stackclosed;

/*
*多个线程访问同一个方法的局部变量时，不会出现线程安全问题，因为局部变量存储在栈中，属于线程私有的。
*
 */

public class StackClosedExample {

    public void add100(){
        int cnt = 0;//局部变量，线程私有
        for (int i = 0; i < 100; i++) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
