package oo.inheritance.demo06;

public class NewPhone extends Phone {
    @Override
    public void show(){

        super.show();//把父类的方法拿来用
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
