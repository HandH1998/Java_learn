package array;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array={12,34,45,67,89};
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("最大值："+max);
    }
}
