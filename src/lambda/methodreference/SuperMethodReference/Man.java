package lambda.methodreference.SuperMethodReference;

//定义一个子类
public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("Hello,我是Man!");
    }
    public void method(Greetable g){
        g.greet();
    }
    public void show(){
//        method(()->{
//            //创建父类Human对象
//            Human h=new Human();
//            //调用父类的sayHello方法
//            h.sayHello();
//        });
        //因为有子父类关系，所以存在一个关键字super，
//        method(()->super.sayHello());

        //使用super引用父类的成员方法
        method(super::sayHello);
    }
    public static void main(String[] args) {
        new Man().show();
    }
}
