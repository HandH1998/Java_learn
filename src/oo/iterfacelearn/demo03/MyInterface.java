package oo.iterfacelearn.demo03;

public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void method();


    @Override
    default void methodDefault() {

    }
}
