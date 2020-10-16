package multithread.threadbasic;

public class Demo04SetThreadName {
    public static void main(String[] args) {
        MyThread2 mt=new MyThread2();
        mt.setName("小强");
        mt.start();//小强

        new MyThread2("旺财").start();//旺财
    }
}
