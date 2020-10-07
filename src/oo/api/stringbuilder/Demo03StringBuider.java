package oo.api.stringbuilder;

public class Demo03StringBuider {
    public static void main(String[] args) {
        //String->StringBuilder
        String str="hello";
        System.out.println("str:"+str);
        StringBuilder bu=new StringBuilder(str);

        bu.append("world");
        System.out.println(bu);

        //StringBuilder->String
        String s = bu.toString();
        System.out.println(s);
    }
}
