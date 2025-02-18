package BasicMultithreading2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Q2 {
    public static void main(String[] args) throws InterruptedException {
        Resource r1 = new Resource("r1");
        Resource r2 = new Resource("r2");

        Lock l1 = new ReentrantLock();
        Lock l2 = new ReentrantLock();

        Process p1 = new Process(r1, r2, l1, l2);
        Process p2 = new Process(r2, r1, l2, l1);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Deadlock Avoided Successfully");
    }
}
