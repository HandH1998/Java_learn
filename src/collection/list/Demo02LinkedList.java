package collection.list;

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main(String[] args) {
        //创建LinkedList集合对象
        LinkedList<String> linked=new LinkedList<>();
        //使用add方法添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);//[a, b, c]

        //public E removeFirst()
        String s=linked.removeFirst();
        System.out.println(s);
        //public E removeLast()
        System.out.println(linked.removeLast());


        //public E getFirst()
        String first=linked.getFirst();
        System.out.println(first);//a

        //public E getLast()
        String last=linked.getLast();
        System.out.println(last);//c


        //public void addFirst(E e)
        linked.addFirst("www");
        System.out.println(linked);//[www, a, b, c]

        //public void push(E e)
        linked.push("sss");
        System.out.println(linked);//[sss, www, a, b, c]

        //public void addLast(E e)
        linked.addLast("com");
        System.out.println(linked);//[sss, www, a, b, c, com]
        linked.add("sdee");
        System.out.println(linked);//[sss, www, a, b, c, com, sdee]


    }
}
