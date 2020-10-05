package oo.polymorphism.demo11;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface2 {
    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态写法
        ArrayList<String> list=new ArrayList<>();
        List<String> result=addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        return list;
    }
}
