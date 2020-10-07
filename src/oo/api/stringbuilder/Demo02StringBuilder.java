package oo.api.stringbuilder;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu= new StringBuilder();
        //append方法返回的是this，调用方法的对象
        StringBuilder bu2=bu.append("sfdfasd");//把bu的地址赋值给bu2
        System.out.println(bu);//"sfdfasd"
        System.out.println(bu2);//"sfdfasd"
        System.out.println(bu==bu2);//比较的是地址 true

        //使用append方法无需接受返回值
//        bu.append("adfdfd");
//        bu.append(1);
//        bu.append(true);
//        bu.append(3.3);
//        System.out.println(bu);

        //链式编程：方法返回值是一个对象，可以继续调用方法
        bu.append("dsfdsf").append(34).append(true);
        System.out.println(bu);
    }
}
