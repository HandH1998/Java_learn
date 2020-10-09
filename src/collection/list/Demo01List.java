package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();//多态
        list.add("s");
        list.add("m");
        list.add("s");
        System.out.println(list);//[s, m, s]重写了toString

        //public void add(int index,E element)
        list.add(2,"m");
        System.out.println(list);//[s, m, m, s]

        //public E remove(int index)
        String removeE=list.remove(2);
        System.out.println("被移除的元素："+removeE);//m
        System.out.println(list);//[s, m, s]

        //public E set(int index,E element)
        String setE=list.set(2,"a");
        System.out.println("被替换的元素："+setE);//s
        System.out.println(list);//[s, m, a]

        //3中遍历list集合的方式
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            String s=list.get(i);
            System.out.println(s);
        }
        System.out.println("======");

        //使用迭代器
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("======");

        //增强for
        for (String s : list) {
            System.out.println(s);
        }

//        list.get(5);//错误！IndexOutOfBoundsException




    }
}
