package multithread.threadbasic;

public class MyThread2 extends Thread{
    public MyThread2(){
    }

    public MyThread2(String name){
        super(name);//调用父类的构造方法，让父类给子线程起一个名字
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
