package collection.generic;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gm=new GenericMethod();
        gm.method01(20);
        gm.method01(true);
        gm.method01("sfdf");

        GenericMethod.method02("静态方法");

        int m=gm.method03(3);
        System.out.println(m);
    }
}
