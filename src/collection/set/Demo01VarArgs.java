package collection.set;

public class Demo01VarArgs {
    public static void main(String[] args) {
        int i=add(12,23,34);
        System.out.println(i);
    }

    //定义一个方法，计算0~n个int类型整数的和
    public static int add(int... arr){
//        System.out.println(arr);//[I@1b6d3586 arr是数组
//        System.out.println(arr.length);
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum;
    }
}
