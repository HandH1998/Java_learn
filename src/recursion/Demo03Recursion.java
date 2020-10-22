package recursion;

public class Demo03Recursion {
    public static void main(String[] args) {
//        factorial(100);
        System.out.println(factorial(10));
    }

    private static int factorial(int i) {
        if(i==1){
            return 1;
        }
        return i*factorial(--i);
    }
}
