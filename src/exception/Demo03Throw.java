package exception;

public class Demo03Throw {
    public static void main(String[] args) {
        int[] arr=null;
//        int[] arr={1,2,3};
        int e=getElement(arr,3);
        System.out.println(e);
    }

    public static int getElement(int[] arr,int index){
        //首先对传递过来的参数进行合法性校验
        if(arr==null){
            throw new NullPointerException("传递的数组的值是null");
        }
        if(index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组索引越界");
        }
        int ele=arr[index];
        return ele;
    }
}
