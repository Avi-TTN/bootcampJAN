package BasicMultithreading1;

public class CacheExample implements Runnable {
    volatile boolean flag = true;

    @Override
    public void run() {
        {
            while(flag){
                System.out.println("Flag = true");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Flag = false");
        }
    }
}
