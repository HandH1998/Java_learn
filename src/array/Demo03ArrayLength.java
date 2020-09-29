package array;

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA=new  int[3];
        int[] arrayB={10,35,55,44};
        int len=arrayB.length;
        System.out.println("数组arrayB的长度："+len);
        System.out.println("=======");

        int[] arrayC=new int[3];
        System.out.println(arrayC.length);//3
        arrayC=new int[5];
        System.out.println(arrayC.length);//5
    }
}
