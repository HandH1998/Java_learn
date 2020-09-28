package array;

public class Demo03Array {
    public static void main(String[] args) {
        //省略格式的静态初始化
        int[] arrayA={10,20,30};
        //静态初始化的标准格式，可以拆分为两个步骤
        int[] arrayB;
        arrayB=new int[] {22,33,44};
        //冬天初始化的标准格式，也可以
        int[] arrayC;
        arrayC=new int[4];
        //静态初始化的省略格式，不能拆成两个步骤
//        int[] arrayD;错误！！
//        arrayD={3,5};错误！！
    }
}
