package funcinterface.demo03lambdatest;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {
    //定义一个方法，方法的返回值类型使用函数式接口Comparator
    public static Comparator<String> getComparator(){
        //方法的返回值是一个接口，可以返回这个接口的匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //按照字符串降序排列
//                return o2.length()-o1.length();
//            }
//        };
        //方法的返回值是一个接口，可以返回lambda表达式
//        return (String o1, String o2)->{
//            return o2.length()-o1.length();
//        };
        //优化lambda表达式
        return (o1,o2)->o2.length()-o1.length();

    }

    public static void main(String[] args) {
        String[] arr={"aaa","bbbbb","dddddd"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }

}
