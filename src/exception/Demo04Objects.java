package exception;

import java.util.Objects;

public class Demo04Objects {
    public static void main(String[] args) {
        method(null);

    }

    public static void method(Object obj){
//        if(obj==null){
//            throw new NullPointerException("传递的对象是null");
//        }
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象是null");
    }
}
