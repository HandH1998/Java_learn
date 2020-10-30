package net.demo01TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建一个客户端对象Socket，构造方法绑定服务器ip和服务器端端口号
        Socket socket=new Socket("127.0.0.1",8888);
        //使用Socket对象中的方法getOutputStream()获取Socket的OutputStream对象
        OutputStream os=socket.getOutputStream();
        //使用Socket中的OutputStream对象中的方法write，给服务器发送数据
        os.write("你好服务器".getBytes());
        //使用Socket对象中的方法getInputStream()获取Socket的InputStream对象
        InputStream is = socket.getInputStream();
        //使用Socket中的OutputStream对象中的方法read，读取服务器会写的数据
        byte[] bytes=new byte[1024];
        int len = is.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes,0,len));
        //释放资源Socket
        socket.close();

    }
}
