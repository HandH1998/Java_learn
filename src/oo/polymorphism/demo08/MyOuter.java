package oo.polymorphism.demo08;

public class MyOuter {
    public void methodOuter(){
        int num=10;//所在方法的局部变量

        class Inner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
