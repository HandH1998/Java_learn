package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();

        //使用add添加元素
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(1);
        System.out.println(set);
        //使用迭代器遍历Set集合
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer n=it.next();
            System.out.println(n);//1,2,3
        }
        //增强for遍历
        System.out.println("======");
        for (Integer integer : set) {
            System.out.println(integer);
        }


    }
}
