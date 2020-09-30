package oo;

public class Demo01VariableDifference {
    String name;//成员变量
    public void methodA(){
        int num=20;//局部变量
        System.out.println(num);
        System.out.println(name);//null
    }
    public void methodB(int param){//方法的参数就是局部变量
        //参数在被调用的时候，必然会被赋值的
        int age;//局部变量,没有默认值，不手动赋初值会出错
//        System.out.println(age);没赋值不能用
//        System.out.println(num);错误写法！
        System.out.println(name);//null
    }
}
