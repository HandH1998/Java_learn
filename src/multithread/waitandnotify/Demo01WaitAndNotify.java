package multithread.waitandnotify;

public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj=new Object();
        //创建顾客线程
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("告诉老板包子的数量和种类");
                        //这里不能抛异常，因为父类Thread的run方法没抛异常，
                        //所以子类的run方法也不能抛异常，只能try catch
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子吃完了");
                        System.out.println("============");
                    }
                }
                }
        }.start();

        //创建老板线程
        new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("包子做好了");
                        obj.notify();
                    }
                }

            }
        }.start();
    }
}
