package lambda.lambda_basic;

public class Demo03Cook {
    public static void main(String[] args) {
        /*invokeCook(new Cook() {
            @Override
            public void makefood() {
                System.out.println("吃饭了");
            }
        });*/

        //使用lambda表达式简化匿名内部类的写法
        invokeCook(()->{
            System.out.println("吃饭了");
        });
    }




    public static void invokeCook(Cook cook){
        cook.makefood();
    }
}
