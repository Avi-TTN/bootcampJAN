package BasicMultithreading1;

public class Bank implements Runnable{
    int money = 100;
    // Synchronized Method
    @Override
    public synchronized void run(){
        int halfMoney = money/2;
        while(halfMoney < money)
        {
            System.out.println("Money Deducted by : " + Thread.currentThread().getName() + " | Money Left : " + money);
            money -= 10;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    // Synchronized Block
//    @Override
//    public  void run(){
//        synchronized (this){
//            int halfMoney = money / 2;
//            {
//                while (halfMoney < money) {
//                    System.out.println("Money Deducted by : " + Thread.currentThread().getName() + " | Money Left : " + money);
//                    money -= 10;
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }
//    }
}
