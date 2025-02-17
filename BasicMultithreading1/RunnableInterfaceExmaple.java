package BasicMultithreading1;

import static java.lang.Thread.currentThread;

public class RunnableInterfaceExmaple implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(currentThread().getName() + " using Runnable Interface");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }
}
