package forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class TestForkJoin {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinExample example = new ForkJoinExample(1, 100);
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        Future result = forkJoinPool.submit(example);
        System.out.println(result.get());
    }
}
