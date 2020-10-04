package oo.iterfacelearn.demo01;

public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1");
//        methodCommon();
    }
    public default void methodDefault2(){
        System.out.println("默认方法2");
//        methodCommon();
    }
    //java9+可以在接口中定义私有方法
//    private void methodCommon(){
//        System.out.println("AAA");
//        System.out.println("BBB");
//    }

}
