package oo.polymorphism.demo07;

public class Body {//外部类
    public class Heart{//成员内部类
        //内部类方法
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫："+name);//正确写法  内访问外随意
        }
    }
    //外部类的成员变量
    private String name;
    //外部类方法
    public void methodBody(){
        System.out.println("外部类的方法");
        Heart heart=new Heart();
        heart.beat();
    }
}
