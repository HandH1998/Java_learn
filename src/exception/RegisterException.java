package exception;

public class RegisterException extends RuntimeException{
    //空参数构造方法
    public RegisterException() {
        super();
    }
    //添加一个带异常信息的构造方法
    public RegisterException(String s) {
        super(s);
    }
}
