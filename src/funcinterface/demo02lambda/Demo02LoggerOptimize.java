package funcinterface.demo02lambda;

public class Demo02LoggerOptimize {
    //定义一个根据日志等级，显示日志信息的方法
    public static void showLog(int level, MessageBuilder msg){
        if(level==1){
            msg.builderMessage();
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1="Hello";
        String msg2="World";
        String msg3="Java";

        showLog(1,()->{
            return msg1+msg2+msg3;
        });

        showLog(2,()->{
            System.out.println("不满足条件不执行");
            return msg1+msg2+msg3;
        });
    }
}
