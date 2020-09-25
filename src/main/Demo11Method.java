package main;

public class Demo11Method {
    public static void main(String[] args){
        farmer();
        seller();
        cook();
        me();
    }
    public static void me(){
        System.out.println("吃");
    }
    public static void cook(){
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
    }
    public static void seller(){
        System.out.println("运输到农贸市场");
        System.out.println("抬高价格");
        System.out.println("吆喝");
        System.out.println("卖给厨子");
    }
    public static void farmer(){
        System.out.println("播种");
        System.out.println("施肥");
        System.out.println("浇水");
        System.out.println("除虫");
        System.out.println("卖给小商贩");
    }
}
