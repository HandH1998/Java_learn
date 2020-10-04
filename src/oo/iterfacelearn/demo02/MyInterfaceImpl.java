package oo.iterfacelearn.demo02;

public class MyInterfaceImpl /*extends Object*/ implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写方法A");
    }



    @Override
    public void methodB() {
        System.out.println("覆盖重写方法B");

    }
    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口中都有的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口中冲突的默认方法进行覆盖重写");
    }
}

