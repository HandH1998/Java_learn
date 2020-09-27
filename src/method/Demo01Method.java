package method;

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }
    public static void printMethod(){
        for(int i=0;i<5;i++){
            for (int j = 0; j < 20; j++) {
                System.out.print("*");//每打印完不换行
            }
            //System.out.println("*");//每打印完换行
            System.out.println();//单纯打印换行
        }
    }
}
