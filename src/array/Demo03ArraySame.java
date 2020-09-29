package array;

public class Demo03ArraySame {
    public static void main(String[] args) {
        int[] arrayA =new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//0
        System.out.println(arrayA[2]);//0

        //改变数组当中的元素
        arrayA[1]=10;
        arrayA[2]=20;

        System.out.println(arrayA);
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//10
        System.out.println(arrayA[2]);//20
        System.out.println("===========");
        //将arrayA的地址值赋值给arrayB
        int[] arrayB =arrayA;
        System.out.println(arrayB);
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//10
        System.out.println(arrayB[2]);//20

        //改变数组当中的元素
        arrayB[1]=100;
        arrayB[2]=200;

        System.out.println(arrayB);
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//100
        System.out.println(arrayB[2]);//200
    }
}
