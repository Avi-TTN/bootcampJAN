package BasicMultithreading1;

import static java.lang.Thread.currentThread;

public class Q1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(currentThread().getName() + " thread");

        ThreadClassExample threadClassExample = new ThreadClassExample();
        Runnable runnableInterfaceExmaple = new RunnableInterfaceExmaple();
        Thread thread = new Thread(runnableInterfaceExmaple);

        threadClassExample.start();
        thread.start();
        thread.join();


        System.out.println(currentThread().getName() + " thread");
    }
}
