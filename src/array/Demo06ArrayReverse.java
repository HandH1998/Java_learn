package array;

public class Demo06ArrayReverse {
    public static void main(String[] args) {
        int[] array={12,34,45,67,89};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=====");
        for(int min=0,max= array.length-1;min<max;min++,max--){
            int temp=array[min];
            array[min]=array[max];
            array[max]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
