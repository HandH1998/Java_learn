package lambda.methodreference.ThisMethodReference;

public class Husband {
    //定义一个买房子的方法
    public void buyHouse(){
        System.out.println("北京二环内买一套四合院！");

    }
    //定义一个结婚的方法，参数传递Richable接口
    public void marry(Richable r){
        r.buy();
    }
    //定义一个高兴的方法
    public void soHappy(){
        //调用结婚的方法，方法的参数Richable接口，可以传递lambda
//        marry(()->{
////            buyHouse();//也可以
////            this.buyHouse();
//        });
        //方法引用
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
