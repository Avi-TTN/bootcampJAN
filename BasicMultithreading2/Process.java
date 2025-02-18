package BasicMultithreading2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Process implements Runnable{
    Resource r1;
    Resource r2;

    Lock l1;
    Lock l2;

    Process(Resource r1, Resource r2, Lock l1, Lock l2){
        this.r1 = r1;
        this.r2 = r2;
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public void run(){
        boolean flag = true;
        while(flag)
        {
            try{
                Thread.sleep((int) (Math.random() * 100));

                if (l1.tryLock()) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " locked a Resource " + r1);
                        r1.take();

                        Thread.sleep(1000);

                        if (l2.tryLock()) {
                            try{
                                System.out.println(Thread.currentThread().getName() + " locked a Resource " + r2);
                                r2.take();
                            }
                            finally {
                                System.out.println(Thread.currentThread().getName() + " unlocked the Resource " + r2);
                                l2.unlock();
                            }
                            flag = false;
                        }
                    }
                    finally {
                        System.out.println(Thread.currentThread().getName() + " unlocked the Resource " + r1);
                        l1.unlock();
                    };
                }
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + "'s work done !!!");
    }
}
