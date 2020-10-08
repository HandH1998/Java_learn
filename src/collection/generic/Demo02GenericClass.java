package collection.generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型默认Object类型
        GenericClass gc=new GenericClass();
        gc.setName("字符串");
//        String s=gc.getName();//报错String=Object
        Object obj=gc.getName();
        System.out.println(obj);

        //创建GenericClass对象，泛型使用Integer
        GenericClass<Integer> gc2=new GenericClass<>();
        gc2.setName(3);
        Integer name=gc2.getName();
        System.out.println(name);

        //创建GenericClass对象，泛型使用String
        GenericClass<String> gc3=new GenericClass<>();
        gc3.setName("小明");
        String s = gc3.getName();
        System.out.println(s);


    }
}
