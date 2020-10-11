package exception;

import sun.security.rsa.RSAUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        //Exception：编译期异常
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//        Date date= null;
//        try {
//            date = sdf.parse("1999-09-");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(date);

        //RuntimeException：运行期异常
//        int[] arr={1,2,3};
//        try{
//            System.out.println(arr[3]);
//        }catch (Exception e){
//            System.out.println(e);
//        }

        //Error：错误
        //OutOfMemoryError: Java heap space
        //内存溢出的错误，创建的数组太大，超出了给JVM分配的内存
        int[] arr=new int[1024*1024*1024];
        //必须修改代码，创建的数组小一点

        System.out.println("后续代码");
    }


}
