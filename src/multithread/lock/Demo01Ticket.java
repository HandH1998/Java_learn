package multithread.lock;

public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImpl run=new RunnableImpl();
        //创建一个实现类对象传到三个线程里
        //这样就是一个实现类对象里的数据共享到三个线程
        Thread t0=new Thread(run);
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);

        //启动线程
        t0.start();
        t1.start();
        t2.start();
    }
}
