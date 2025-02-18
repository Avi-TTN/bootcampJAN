package BasicMultithreading2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q3 {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        System.out.println("newSingleThreadExecutor");
        for(int i = 1; i <= 5; i++){
            final int num = i;
            singleThreadExecutor.submit(() -> System.out.println("Task " + num + " executed by " + Thread.currentThread().getName()));
        }
        singleThreadExecutor.shutdown();

        Thread.sleep(2000);
        System.out.println("newFixedThreadPool");
        for(int i = 1; i <= 5; i++){
            final int num = i;
            fixedThreadPool.submit(() -> System.out.println("Task " + num + " executed by " + Thread.currentThread().getName()));
        }
        fixedThreadPool.shutdown();

        Thread.sleep(2000);
        System.out.println("newCachedThreadPool");
        for(int i = 1; i <= 5; i++){
            final int num = i;
            cachedThreadPool.submit(() -> System.out.println("Task " + num + " executed by " + Thread.currentThread().getName()));
        }

        cachedThreadPool.shutdown();
    }
}
