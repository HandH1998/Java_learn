package multithread;

public class Demo03GetThreadName {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());//main
        MyThread1 mt=new MyThread1();
        mt.start();

        new MyThread1().start();
        new MyThread1().start();
    }
}
