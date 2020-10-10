package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo04HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }

    //HashMap存储自定义类型键值
    //key:Person类型
    //Person类必须重写hashCode和equals方法，以保证key唯一
    //value:String类型
    //value可以重复
    private static void show02() {

        HashMap<Person,String> map=new HashMap<>();
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"秦国");
        map.put(new Person("普京",30),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");

        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }


    }

    //HashMap存储自定义类型键值
    //key:String类型
    //String类重写了hashCode和equals方法，可以保证key唯一
    //value:Person类型
    //value可以重复
    private static void show01() {
        HashMap<String,Person> map=new HashMap<>();
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));

        Set<String> set = map.keySet();
        for (String s : set) {
            Person value=map.get(s);
            System.out.println(s+"="+value);

        }


    }
}
