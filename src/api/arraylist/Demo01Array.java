package api.arraylist;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array=new Person[3];
        System.out.println(array[0]);//null
        Person one=new Person("迪丽热巴",34);
        Person two=new Person("古力娜扎",23);
        Person three=new Person("马尔扎哈",56);

        array[0]=one;//存的是对象地址
//        array[0]=new Person("smd",34);
        array[1]=two;//存的是地址
        array[2]=three;//存的是地址

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());//古力娜扎
    }
}
