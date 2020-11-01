package funcinterface.demo04supplier;

import java.util.function.Supplier;

public class Demo02Test {
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //定义一个int[]
        int[] arr={100,2,45,-89};
        int a=getMax(()->{
            int max=arr[0];
            for (int i : arr) {
                if(i>max){
                    max=i;
                }
            }
            return max;
        });
        System.out.println(a);
    }
}
