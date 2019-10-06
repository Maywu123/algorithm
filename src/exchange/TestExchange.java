package exchange;

import java.util.concurrent.Exchanger;

public class TestExchange {
    public static void main(String[] args){
        Exchanger<String> exchanger=new Exchanger<>();
        ThreadA a=new ThreadA(exchanger);
        ThreadB b=new ThreadB(exchanger);

        a.start();
        b.start();
    }
}
