package oo.api.wrapperclass;

import java.util.ArrayList;

public class Demo02Integer {
    public static void main(String[] args) {
        //自动装箱
        Integer in=1;
        //自动拆箱：in是包装类，无法直接参与运算，
        // 但是可以自动转换为基本数据类型，再进行计算
        //in+2:in.intValue()+2=3;
        //in=3又是一个自动装箱
        in=in+2;

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);//自动装箱
        int a=list.get(0);//自动拆箱

    }
}
