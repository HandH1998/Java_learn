package oo.encapsulation;

public class Demo02Method {
    public static void main(String[] args) {
        int[] array={5,15,25,20,100};
        int max=getMax(array);
        System.out.println("最大值："+max);
    }
    public static int getMax(int[] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max= array[i];
            }
        }
        return max;
    }
}
