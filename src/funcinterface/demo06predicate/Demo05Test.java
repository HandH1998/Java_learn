package funcinterface.demo06predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo05Test {
    public static ArrayList<String> checkName(String[] arr, Predicate<String> pre1, Predicate<String> pre2){
        ArrayList<String> list=new ArrayList<>();
        for (String s : arr) {
            if(pre1.and(pre2).test(s)){
                list.add(s);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};
        ArrayList<String> strings = checkName(arr, (str) -> {
            return str.split(",")[0].length()==4;
        }, (str) -> {
            return str.split(",")[1].equals("女");
        });
        System.out.println(strings);
    }
}
