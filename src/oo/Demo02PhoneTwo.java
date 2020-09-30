package oo;

public class Demo02PhoneTwo {
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

        Phone two=new Phone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        two.brand="三星";
        two.color="蓝色";
        two.price=38382.0;

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        two.call("oba");
        two.sendMessage();
    }
}
