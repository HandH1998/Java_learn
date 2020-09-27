package basic;

public class Demo13LoopDifference {
    public static void main(String[] args) {
        for (int i = 1; i < 0; i++) {
            System.out.println("Hello");
        }
        //.out.println(i);//错误写法，i定义在for循环小括号里

        int i = 1;
        do {
            System.out.println("World");
            i++;
        } while (i < 0);
        System.out.println(i);

    }

}
