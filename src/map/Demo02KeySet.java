package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key=it.next();
            Integer value=map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("=======");

        for (String s : set) {
            Integer value=map.get(s);
            System.out.println(s+"="+value);
        }
    }
}
