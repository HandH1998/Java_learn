package api.string;

public class Demo04StringConvert {
    public static void main(String[] args) {
        //转换成字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);//5
        System.out.println("======");

        //转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("======");

        String str1="How do you do";
        String str2 = str1.replace("o", "8");
        System.out.println(str1);
        System.out.println(str2);
    }
}
