package method;

public class Demo03OverloadJudge {
    public static void open(){}
    public static void open(int a){}
    //static void open(int a,int b){}//错误，和第8行冲突
    public static void open(double a,int b){}
    //public static void open(int a,double b){}//和第6个冲突，参数名无关
    //public void open(int i,double d){}//和第5个冲突，参数名无关
    public static void OPEN(){}//方法名不一样，不是一个方法，不会报错
    //public static void open(int i,int j){}//错误，和第3行冲突
}
