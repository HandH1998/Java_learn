package collection.set;

public class Demo02HashCode {
    public static void main(String[] args) {
        //Person类继承了Object类，可以使用Object类的hashCode方法
        Person p1=new Person();
        int h1=p1.hashCode();
        System.out.println(h1);//460141958
        System.out.println(p1);//collection.set.Person@1b6d3586

        Person p2=new Person();
        int h2=p2.hashCode();
        System.out.println(h2);//1163157884
        System.out.println(p2);//collection.set.Person@4554617c

        System.out.println(p1==p2);//false  即使哈希值相同实际的物理地址还是不一样的  返回false

        //String类的哈希值，String类重写了Object类的hashCode方法
        String s1=new String("abc");
        String s2=new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}
