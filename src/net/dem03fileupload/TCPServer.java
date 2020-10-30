package net.dem03fileupload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        //使用多线程技术，提高效率


        while(true){
            Socket socket = server.accept();
            //由于父类Runnable的run方法没有声明异常，所以不能抛出
            //只能try catch
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream is = socket.getInputStream();
                        OutputStream os = socket.getOutputStream();
                        String fileName = "zy" + System.currentTimeMillis() + new Random().nextInt(999999) + ".pdf";
                        File file = new File("C:\\Users\\ZY\\Desktop" + "\\" + fileName);
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileOutputStream fos = new FileOutputStream(file);
                        //从网络流中读  然后写入服务器本地
                        int len = 0;
                        byte[] bytes = new byte[1024];

                        System.out.println("1111111111111111");
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }
                        System.out.println("2222222222222222");
                        //给客户端发消息
                        os.write("上传成功".getBytes());
                        socket.shutdownOutput();

                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
//        server.close();

    }
}
