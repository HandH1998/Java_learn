package array;

public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result=calculate(21,34,576);
        System.out.println("总和："+result[0]);
        System.out.println("平均值："+result[1]);
        System.out.println("main方法收到的返回值数组是："+result);
    }
    public static int[] calculate(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        //两个结果都希望进行返回
        //需要一个数组，也就是一个塑料兜，数组可以保存多个结果
/*        int[] array=new int[2];
        array[0]=sum;
        array[1]=avg;*/

        int[] array={sum,avg};
        System.out.println("calculate方法内部的数组是："+array);
        return array;
    }
}
