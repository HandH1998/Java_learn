package array;

public class Demo04ArrayUse {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int[] array={10,20,30};
        System.out.println(array);//内存地址哈希值 [I@1b6d3586
        //[ 表示是数组  I表示数组里是int类型  @后边的是十六进制
        System.out.println(array[0]);

        int num=array[1];
        System.out.println(num );
    }
}
