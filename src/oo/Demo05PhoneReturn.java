package oo;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two=getPhone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
    }
    public static Phone getPhone(){
        Phone one=new Phone();
        one.brand="苹果";
        one.price=3434.0;
        one.color="玫瑰金";
        return one;
    }
}
