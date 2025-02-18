package BasicMultithreading2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Q5 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () ->{
            System.out.println("Thread started... ");
                for(int i = 0; i < 1000000; i++) {
                    if (i % 100000 == 0) {
                        System.out.println("Counter : " + i);
                    }
                    if(Thread.interrupted()){
                        System.out.println("Thread is Interrupted !!!");
                        break;
                    }
                }
        };
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.submit(runnable);

        es.shutdown();
//        es.shutdownNow();
        es.awaitTermination(1,TimeUnit.SECONDS);
        System.out.println("-- Work Done --");


    }
}
