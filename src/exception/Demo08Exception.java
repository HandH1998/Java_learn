package exception;

import java.util.ArrayList;
import java.util.List;

public class Demo08Exception {
    public static void main(String[] args) {
        //多个异常分别处理
//        try{
//            int[] arr={1,2,3};
//            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//
//        try{
//            List<Integer> list=new ArrayList<>();
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            System.out.println(list.get(3));//IndexOutOfBoundsException
//        } catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//
//        System.out.println("后续代码");

        //多个异常一次捕获，多次处理
//        try{
//            int[] arr={1,2,3};
//            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
//
//            List<Integer> list=new ArrayList<>();
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            System.out.println(list.get(3));//IndexOutOfBoundsException
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        } catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//        System.out.println("后续代码");

        //多个异常一次捕获一次处理

        try{
            int[] arr={1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException

            List<Integer> list=new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(3));//IndexOutOfBoundsException
//        }catch (IndexOutOfBoundsException e){
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
