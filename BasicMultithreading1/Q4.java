package BasicMultithreading1;

public class Q4 {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Process p1 = new Process(r1, r2);
        Process p2 = new Process(r2, r1);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();

    }
}
