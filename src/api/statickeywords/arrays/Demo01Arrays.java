package api.statickeywords.arrays;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray={10,34,56};
        //将int[]数组按照默认格式变成字符串
        String intStr= Arrays.toString(intArray);
        System.out.println(intStr);//[10, 34, 56]
        System.out.println(intArray);//[I@1b6d3586 地址值

        int[] array1={2,34,65,45};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));//[2, 34, 45, 65]

        String[] array2={"dds","dsa","erd"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));//[dds, dsa, erd]

    }
}
