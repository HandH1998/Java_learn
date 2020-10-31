package funcinterface.demo02lambda;

public class Demo01Logger {
    //定义一个根据日志等级，显示日志信息的方法
    public static void showLog(int level, String message){
        if(level==1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1="Hello";
        String msg2="World";
        String msg3="Java";

        showLog(1,msg1+msg2+msg3);
    }
}
