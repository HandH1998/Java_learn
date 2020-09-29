package array;

public class Demo04ArrayIndex {
    public static void main(String[] args) {
        int[] array={15,25,35};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //错误！索引越界
        System.out.println(array[3]);
    }

}
