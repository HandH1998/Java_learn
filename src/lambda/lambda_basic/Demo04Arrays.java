package lambda.lambda_basic;

import java.util.Arrays;

public class Demo04Arrays {
    public static void main(String[] args) {
        Person[] arr={
                new Person("jj",34),
                new Person("ssd",32),
                new Person("smm",23),
        };
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        //使用lambda表达式简化匿名内部类
        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge()-o2.getAge();
        });

        for (Person person : arr) {
            System.out.println(person);
        }

    }
}
