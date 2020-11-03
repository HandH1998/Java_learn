package lambda.methodreference.ObjectMethodReference;

public class Demo02ObjectMethodReference {
    public static void printString(Printable p){
        p.print("Hello");
    }

    public static void main(String[] args) {
        printString((s)->{
            MethodRerObject obj=new MethodRerObject();
            obj.printUpperCaseString(s);
        });

        //使用方法引用优化Lambda
        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCaseString);
        printString(new MethodRerObject()::printUpperCaseString);//使用匿名对象进行方法引用
    }
}
