package lambda.lambda_basic;

public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类是实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");

            }
        }).start();

        //使用lambda表达式实现多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"新线程创建了");
        }).start();
        //省略的lambda格式
        new Thread(()->System.out.println(Thread.currentThread().getName()+"新线程创建了")).start();
    }
}
