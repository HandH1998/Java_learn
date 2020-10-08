package collection.generic;

public class GenericMethod {
    //定义一个含有泛型的方法
    //<>中的字母都可以
    public <M> void method01(M m){
        System.out.println(m);
    }

    //定义一个含有泛型的静态方法
    public static <S> void method02(S s){
        System.out.println(s);
    }

    public <M> M method03(M m){
        return m;
    }

}
