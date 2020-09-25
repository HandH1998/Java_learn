package main;

public class Demo07Switch {
    public static void main(String[] args){
        int num=1;
        switch(num){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周天");
                break;
            default:
                System.out.println("数据不合理");
                break;//最后一个break语句可以省略，但是推荐不省略
        }
    }
}
