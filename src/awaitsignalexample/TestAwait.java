package awaitsignalexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestAwait {
    public static void main(String[] args){

        ExecutorService executorService = Executors.newCachedThreadPool();//线程池
        AwaitSignalExample example = new AwaitSignalExample();

        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());

    }
}
