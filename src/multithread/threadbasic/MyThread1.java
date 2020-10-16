package multithread.threadbasic;

public class MyThread1 extends Thread{
    @Override
    public void run() {
//        String name=getName();
//        System.out.println(name);
        Thread t=Thread.currentThread();
        System.out.println(t);//获取当前正在执行的线程
        String name=t.getName();
        System.out.println(name);
    }
}
