package BasicMultithreading1;

public class ThreadClassExample extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(currentThread().getName() + " using Thread Class");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Thread Interrupted");
            }
        }
    }
}
