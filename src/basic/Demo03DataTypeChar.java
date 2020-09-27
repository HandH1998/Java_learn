package basic;

public class Demo03DataTypeChar {
    public static void main(String[] args){
        char zifu1='1';
        System.out.println(zifu1+0);

        char zifu2='A';

        char zifu3='c';

        //char-->int 确实是从小到大，自动转换
        int num=zifu3;
        System.out.println(num);

        char zifu4='中';
        System.out.println(zifu4+0);//20013
    }
}
