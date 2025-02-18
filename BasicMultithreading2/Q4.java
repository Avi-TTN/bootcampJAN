package BasicMultithreading2;

import java.util.concurrent.*;

public class Q4 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> c = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return (int)(Math.random() * 100);
            }
        };
        ExecutorService es = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 5; i++){
            Future<Integer> randomInt = es.submit(c);
            System.out.println(randomInt.get());
        }
        es.shutdown();
    }
}
