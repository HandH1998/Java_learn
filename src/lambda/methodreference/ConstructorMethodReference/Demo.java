package lambda.methodreference.ConstructorMethodReference;

public class Demo {
    //定义一个方法，参数传递姓名和PersonBuilder接口欧
    public static void printName(String name, PersonBuilder pb){
        Person person=pb.builderPerson(name);
        System.out.println(person);
    }

    public static void main(String[] args) {
        printName("迪丽热巴",(name)->{
            return new Person(name);
        });

        //使用方法引用优化lambda
        printName("古力娜扎",Person::new);
    }
}
