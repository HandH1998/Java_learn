package collection.set;

import java.util.HashSet;

public class Demo04HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合存储Person1
        HashSet<Person1> set=new HashSet<>();
        Person1 p1=new Person1("shuaige",14);
        Person1 p2=new Person1("meinv",15);
        Person1 p3=new Person1("meinv",15);

        System.out.println(p2.hashCode());//460141958
        System.out.println(p3.hashCode());//1163157884

        System.out.println(p2==p3);//false
        System.out.println(p2.equals(p3));//false
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);


    }
}
