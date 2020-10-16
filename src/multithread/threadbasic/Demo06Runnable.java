package multithread.threadbasic;

public class Demo06Runnable {
    public static void main(String[] args) {
//        RunnableImpl run=new RunnableImpl();
        RunnableImpl2 run2=new RunnableImpl2();
        Thread thread=new Thread(run2);
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }

}
