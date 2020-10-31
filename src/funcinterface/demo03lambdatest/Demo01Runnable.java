package funcinterface.demo03lambdatest;

public class Demo01Runnable {
    //定义一个方法startThread
    public static void startThread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //使用匿名内部类作为参数传入
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        //使用lambda表达式传入
        startThread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        //优化lambda表达式
        startThread(()-> System.out.println(Thread.currentThread().getName()));
    }
}
