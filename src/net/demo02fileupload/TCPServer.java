package net.demo02fileupload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\ZY\\Desktop\\使用说明upload.pdf");
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        //从网络流中读  然后写入服务器本地
        int len=0;
        byte[] bytes=new byte[1024];

        System.out.println("1111111111111111");
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        System.out.println("2222222222222222");
        //给客户端发消息
        os.write("上传成功".getBytes());

        //释放资源
        fos.close();
        socket.close();
        server.close();

    }
}
