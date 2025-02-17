package BasicMultithreading1;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        CacheExample r1 = new CacheExample();
        Thread t1 = new Thread(r1);
        t1.start();
        Thread.sleep(5000);
        r1.flag = false;

    }
}
