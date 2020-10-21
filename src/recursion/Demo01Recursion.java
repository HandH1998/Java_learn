package recursion;

public class Demo01Recursion {
    public static void main(String[] args) {
//        a();
        b(1);
    }

    public Demo01Recursion(){
//        Demo01Recursion();//构造方法不能递归
    }

    private static void b(int i) {
        System.out.println(i);
        if(i==20000){//递归次数太多栈内存也会溢出
            return;
        }
        b(++i);
    }


    private static void a() {
        System.out.println("a方法！");
        a();
    }
}
