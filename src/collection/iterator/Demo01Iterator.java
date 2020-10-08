package collection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("詹姆斯");

        //多态  接口=实现类对象
        Iterator<String> it= coll.iterator();

        System.out.println(it.hasNext());
        String s = it.next();
        System.out.println(s);
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //for循环也可

        for(Iterator<String> it2 = coll.iterator();it2.hasNext();){
            System.out.println(it2.next());
        }
        s=it.next();//没有元素再取会抛异常 NoSuchElementException
    }
}
