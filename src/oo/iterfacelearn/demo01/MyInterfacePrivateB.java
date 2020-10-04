package oo.iterfacelearn.demo01;

public interface MyInterfacePrivateB {
    public static void methodDefault1(){
        System.out.println("静态方法1");
//        methodCommon();
    }
    public static void methodDefault2(){
        System.out.println("静态方法2");
//        methodCommon();
    }
    //java9+可以在接口中定义私有方法
//    private static void methodCommon(){
//        System.out.println("AAA");
//        System.out.println("BBB");
//    }

}
