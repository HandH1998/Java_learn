package multithread.synchronize;

import java.util.Objects;

public class RunnableImpl implements Runnable {
    private int ticket=100;

    Object obj=new Object();
    @Override
    public void run() {
        while(true){
            synchronized (obj){
                if(ticket>0){
                    //提高安全问题出现的概率
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                }
            }
        }

    }
}
