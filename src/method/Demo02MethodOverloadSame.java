package method;

public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        System.out.println(isSame((short)2,(short)2));
    }
    public static boolean isSame(byte a,byte b){
        System.out.println("2个byte参数");
        boolean same;
        if(a==b){
            same=true;
        }else{
            same=false;
        }
        return same;
    }
    public static boolean isSame(int a,int b){
        System.out.println("2个int参数");
        boolean same=a==b?true:false;
        return same;
    }
    public static boolean isSame(short a,short b){
        System.out.println("2个short参数");
        return a==b;
    }
    public static boolean isSame(long a,long b){
        System.out.println("2个long参数");
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
}
