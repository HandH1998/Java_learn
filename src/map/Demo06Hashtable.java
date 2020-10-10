package map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo06Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);//{null=null, b=null}

        Hashtable<String,String> table=new Hashtable<>();//键和值不允许null
//        table.put(null,"a");//NullPointerException
//        table.put("b",null);//NullPointerException
//        table.put(null,null);//NullPointerException
    }
}
