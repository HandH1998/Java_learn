package multithread.threadbasic;

public class Demo07InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"黑马");
                }
            }
        }.start();

        //线程的接口是Runnable
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "全栈");
                }
            }
        };
        new Thread(r).start();

        //简化接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "paper");
                }
            }
        }).start();

    }
}
