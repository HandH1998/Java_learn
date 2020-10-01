package api.anonymous;

public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one=new Person();
        one.name="高圆圆";
        one.showName();

        //匿名对象
        new Person().name="赵又廷";
        new Person().showName();//null
    }
}
