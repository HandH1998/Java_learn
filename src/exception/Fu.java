package exception;

public class Fu {
    public void show01() throws NullPointerException,ClassCastException{
    }
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04(){}
}
class Zi extends Fu{
    //子类重写父类方法时，抛出和父类相同的异常
    public void show01() throws NullPointerException,ClassCastException{
    }
    //子类重写父类方法时，抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}

    //子类重写父类方法时，不抛出异常
    public void show03() {}

    //父类方法没抛出异常，子类重写父类方法时也不可抛出异常
//    public void show04() throws Exception{}

    //父类方法没抛出异常，子类若产生异常，只能捕获处理，不能声明抛出异常
    public void show04(){
        try{
            throw new Exception("编译期异常");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
