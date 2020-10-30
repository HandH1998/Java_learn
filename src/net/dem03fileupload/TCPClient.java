package net.dem03fileupload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\ZY\\Desktop\\使用说明.pdf");
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();

        //本地读入  写入网络输出流
        int len = 0;
        byte[] bytes = new byte[1024];
        //客户端在读到-1会中止循环，因此不会把结束标志写到网络输出流
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        //上传完文件给服务器一个结束标志
        //void shutdownOutput()  禁用此套接字的输出流，并且后跟TCP的正常连接终止序列
        socket.shutdownOutput();
        System.out.println("1111111111111111");
        //读取服务器回写
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        System.out.println("2222222222222222");
        //释放资源
        fis.close();
        socket.close();
    }
}
