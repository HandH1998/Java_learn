package map;

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }

    private static void show04() {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        boolean b1 = map.containsKey("赵丽颖");
        System.out.println(b1);//true

        boolean b2 = map.containsKey("赵颖");
        System.out.println(b2);//false
    }

    private static void show03() {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        Integer v1 = map.get("杨颖");
        System.out.println(v1);//165

        Integer v2 = map.get("迪丽热巴");
        System.out.println(v2);
    }

    //public V remove(Object V)
    private static void show02() {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map);//{林志玲=178, 赵丽颖=168, 杨颖=165}

        Integer n=map.remove("林志玲");
        System.out.println(n);//178
        System.out.println(map);//{赵丽颖=168, 杨颖=165}

        Integer m=map.remove("林志颖");
        int m1=map.remove("林志颖");//NullPointerException,null赋值给int类型
        System.out.println(m);//null
        System.out.println(map);//{赵丽颖=168, 杨颖=165}
    }

    //public V put(K key,V value)
    private static void show01() {
        Map<String,String> map=new HashMap<>();
        String v1=map.put("李晨","范冰冰");
        String v2=map.put("李晨","范冰冰2");
        System.out.println(v1);//null
        System.out.println(v2);//范冰冰
        System.out.println(map);//{李晨=范冰冰2}重写了toString

        map.put("冷锋","龙小云");
        map.put("杨过","小龙女");
        System.out.println(map);


    }

}
