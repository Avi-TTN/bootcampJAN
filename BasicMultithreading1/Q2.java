package BasicMultithreading1;

public class Q2 {
    public static void main(String[] args) throws InterruptedException {
        Bank r1 = new Bank();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
        t2.join();

        System.out.println("MONEY AT END : ");
        System.out.println(r1.money);
    }
}
