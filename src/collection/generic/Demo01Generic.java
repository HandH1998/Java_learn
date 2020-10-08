package collection.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        ArrayList<String> list=new ArrayList<>();
        list.add("fdsf");
//        list.add(3);//不能放int数据
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
    }

    private static void show01() {
        ArrayList list=new ArrayList();
        list.add("ddsfs");
        list.add(2);

        Iterator it=list.iterator();
        while(it.hasNext()){
            //取出的元素也是Object类型
            Object obj=it.next();
            System.out.println(obj);

            //想要使用String类特有的方法.length获取字符串的长度
            //但是不能使用  因为：多态 Object obj="abc";
            //需要向下转型
            //会抛出ClassCastException 因为Integer不能转为String类型
//            String s=(String)obj;
//            System.out.println(s.length());
        }
    }
}
