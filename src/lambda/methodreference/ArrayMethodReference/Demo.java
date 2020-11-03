package lambda.methodreference.ArrayMethodReference;

import java.util.Arrays;

public class Demo {
    //定义一个方法  传递数组的长度 和ArrayBuilder接口
    public static int[] createArray(int length, ArrayBuilder ab){

        return ab.builderArray(length);
    }
    public static void main(String[] args) {
        int[] array = createArray(10, (len) -> {
            return new int[len];
        });
        System.out.println(array.length);//10
        //方法引用
        int[] array1 = createArray(10, int[]::new);
        System.out.println(array1.length);
        System.out.println(Arrays.toString(array1));
    }
}
