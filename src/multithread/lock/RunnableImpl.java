package multithread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {
    private int ticket=100;
    //在成员位置处创建一个ReentrantLock对象
    Lock l=new ReentrantLock();


//    @Override
//    public void run() {
//        while(true){
//            //调用Lock接口中的方法lock获取锁
//            l.lock();
//            if(ticket>0){
//                //提高安全问题出现的概率
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
//                ticket--;
//            }
//            //调用Lock接口中的方法unlock释放锁
//            l.unlock();
//        }
//
//    }

    //更好的写法
    @Override
    public void run() {
        while(true){
            //调用Lock接口中的方法lock获取锁
            l.lock();
            if(ticket>0){
                //提高安全问题出现的概率
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //调用Lock接口中的方法unlock释放锁
                    //无论程序是否异常，最后都会把锁释放
                    l.unlock();
                }
            }

        }

    }
}
