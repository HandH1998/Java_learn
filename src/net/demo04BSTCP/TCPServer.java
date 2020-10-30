package net.demo04BSTCP;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket，向系统要指定端口号
        ServerSocket server = new ServerSocket(8080);
        while(true){
            //使用accept方法获取到请求的客户端对象  浏览器
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream is = socket.getInputStream();
//                        byte[] bytes = new byte[1024];
//                        int len = 0;
//                        while ((len = is.read(bytes)) != -1) {
//                            System.out.println(new String(bytes, 0, len));
//                        }
                        //把is网络字节输入流对象，转换为字符缓冲输入流
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        //读取请求头第一行  获取路径
                        String line = br.readLine();
                        System.out.println(line);
                        String[] s = line.split(" ");
                        String path = s[1].substring(1);

                        File file =new File(path);
                        FileInputStream fis = new FileInputStream(file);
                        OutputStream os = socket.getOutputStream();

                        //先写http响应头
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        os.write("\r\n".getBytes());
                        //写入文件内容到网络输出流
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while((len=fis.read(bytes))!=-1){
                            os.write(bytes,0,len);
                        }
                        fis.close();
                        socket.close();
                    }catch(IOException e){
                        System.out.println(e);
                    }
                }
            }).start();


        }



//        server.close();
    }
}
