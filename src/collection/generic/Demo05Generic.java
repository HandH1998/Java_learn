package collection.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02=new ArrayList<>();
        list02.add("a");
        list02.add("b");

//        ArrayList<?> list03=new ArrayList<>();//错误！定义对象的时候不能使用泛型通配符？


        printArray(list01);
        printArray(list02);

    }


    public static void printArray(ArrayList<?> list){
        Iterator<?> it=list.iterator();
        while(it.hasNext()){
            //it.next()方法此时取出的是Object，可以接收任意数据类型

//            Integer obj=it.next();//错误！
            Object obj=it.next();
            System.out.println(obj);
        }

    }
//    错误  ArrayList<Integer>、ArrayList<String>无法转为ArrayList<Object>
//    public static void printArray(ArrayList<Object> list){
//        Iterator<Object> it=list.iterator();
//        while(it.hasNext()){
//            //it.next()方法此时取出的是Object，可以接收任意数据类型
//            Object obj=it.next();
//            System.out.println(obj);
//        }
//
//    }

    //正确  可以使用方法的泛型
//    public static <E> void printArray(ArrayList<E> list){
//        Iterator<E> it=list.iterator();
//        while(it.hasNext()){
//            //it.next()方法此时取出的是Object，可以接收任意数据类型
//            E obj=it.next();
//            System.out.println(obj);
//        }
//
//    }
}
