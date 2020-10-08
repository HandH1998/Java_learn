package collection.generic;

public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericIterfaceImpl1对象
        GenericInterfaceImpl1 gi1=new GenericInterfaceImpl1();
        gi1.method("字符串");

        //创建GenericIterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gi2=new GenericInterfaceImpl2<>();
        gi2.method(23);

        GenericInterfaceImpl2<Double> gi3=new GenericInterfaceImpl2<>();
        gi3.method(34.33);
    }
}
