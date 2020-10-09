package collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        Collections.addAll(list01,1,3,2);

        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1-o2;//升序
                return o2-o1;//降序
            }
        });
        System.out.println(list01);

        ArrayList<Student> list02=new ArrayList<>();
        list02.add(new Student("diliriba",18));
        list02.add(new Student("gulinazha",28));
        list02.add(new Student("maerzhaha",22));
        list02.add(new Student("aw",22));

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               int result= o1.getAge()-o2.getAge();
               if(result==0){
                   result=o1.getName().charAt(0)-o2.getName().charAt(0);
               }
               return result;
            }
        });
        System.out.println(list02);

    }
}
