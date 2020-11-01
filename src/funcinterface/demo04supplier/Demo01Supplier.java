package funcinterface.demo04supplier;

import java.util.function.Supplier;

public class Demo01Supplier {
    //定义一个方法，方法参数传递Supplier<T>接口，泛型执行String
    //get方法返回一个String
    public static String getString(Supplier<String> sup){
         return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(()->{
            return "胡歌";
        });
        System.out.println(s);//
        //优化；lambda表达式
        s = getString(()->"胡歌"
        );
        System.out.println(s);//
    }
}
