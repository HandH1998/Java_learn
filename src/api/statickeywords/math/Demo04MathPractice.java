package api.statickeywords.math;

public class Demo04MathPractice {
    public static void main(String[] args) {
        int num=0;
        for(int i=(int)-10.8;i<5.9;i++){
            int abs=Math.abs(i);
            if (abs>6||abs<2.1){
                System.out.println(i);
                num++;
            }
        }
        System.out.println(num);
    }
}
