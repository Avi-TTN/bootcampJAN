package BasicMultithreading1;

public class Process implements Runnable{
    Resource r1;
    Resource r2;

    Process(Resource r1, Resource r2){
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void run() {
        synchronized (r1){
            System.out.println(Thread.currentThread().getName() + " locked Resource");
            r1.take();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (r2){
                System.out.println(Thread.currentThread().getName() + " locked a Resource");
                r2.take();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
