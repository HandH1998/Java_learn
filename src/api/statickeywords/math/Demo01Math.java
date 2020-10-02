package api.statickeywords.math;

public class Demo01Math {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(3.56));//3.56
        System.out.println(Math.abs(0));//0
        System.out.println(Math.abs(-34.5));//34.5
        System.out.println("=======");

        //向上取整
        System.out.println(Math.ceil(4.5));//5.0
        System.out.println(Math.ceil(-3.4));//-3.0
        System.out.println("=======");


        //向下取整
        System.out.println(Math.floor(4.5));//4.0
        System.out.println(Math.floor(-3.4));//-4.0
        System.out.println("=======");

        //四舍五入
        System.out.println(Math.round(20.5));//21
        System.out.println(Math.round(-13.4));//-13
        System.out.println(Math.round(-13.5));//-13
        System.out.println(Math.round(-13.6));//-14  注意负数的四舍五入：-.9、-.8、-.7、-.6是舍，ceil(原数)+(-1)，
        // 其他是ceil(原数)

    }
}
