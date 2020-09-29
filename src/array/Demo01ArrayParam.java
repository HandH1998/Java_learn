package array;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array={10,20,30,40};
        printArray(array);
        System.out.println("====");
        printArray(array);

    }
    public static void printArray(int[] array){
        System.out.println("printArray收到的参数："+array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
