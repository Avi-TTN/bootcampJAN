package BasicMultithreading2;

import java.util.concurrent.Callable;
import java.util.concurrent.*;

public class Q1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //callable
        ExecutorService es = Executors.newFixedThreadPool(2);
        Callable<Integer> c = () -> {
                int a = 10;
                int b = 20;
                return Multiplication.multiply(a,b);
        };
        Future<Integer> ans = es.submit(c);
        System.out.println("callable answer : " + ans.get());
        es.shutdown();

        //runnable
        Runnable r = () -> {
                int a = 30;
                int b = 40;
                Multiplication.PrintMultiply(a,b);
        };
        Thread t = new Thread(r);
        t.start();

    }
}
