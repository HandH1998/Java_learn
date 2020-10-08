package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，使用多态
//        Collection<String> coll=new ArrayList<>();
        Collection<String> coll=new HashSet<>();
        System.out.println(coll);//重写了toString

        //public boolean add(E e)
        boolean b1=coll.add("张三");
        coll.add("王五");
        System.out.println(b1);
        System.out.println(coll);

        //public boolean remove(E e)
        boolean b2=coll.remove("张三");
        System.out.println(b2);

        boolean b3=coll.remove("李三");
        System.out.println(b3);
        System.out.println(coll);

        //public boolean contains(E e)
        boolean b4=coll.contains("李四");
        System.out.println(b4);
        System.out.println(coll);

        //public boolean isEmpty(E e)
        boolean b5=coll.isEmpty();
        System.out.println(b5);

        //public int size()
        int size= coll.size();
        System.out.println(size);

        //public Object[] toArray()
        Object[] arr= coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //public void clear()
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());
    }
}
