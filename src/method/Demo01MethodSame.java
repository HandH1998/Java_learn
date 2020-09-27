package method;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(32,32));
        System.out.println(isSame(23,45));
    }
    public static boolean isSame(int a,int b){
//        if(a==b){
//            return true;
//        }else{
//            return false;
//        }
        return a==b;
    }
}
