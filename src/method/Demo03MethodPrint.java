package method;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }
    public static void printCount(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("Hello,World!"+(i+1));
        }
    }
}
