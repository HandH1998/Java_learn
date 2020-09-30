package oo;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one=new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        one.brand="苹果";
        one.color="黑色";
        one.price=38338.0;

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        one.call("wo");
        one.sendMessage();
        System.out.println("=====");



    }
}
