package cn.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// tcp通信:  客户端向服务器发送连接请求
public class TcpClient {

    public static void main(String[] args) throws IOException {

        //创建客户端对象
        Socket socket = new Socket("127.0.0.1", 8888);

        OutputStream os = socket.getOutputStream();

        os.write("你好服务器".getBytes());


        //读取服务器
        InputStream inputStream = socket.getInputStream();
        byte[] b=new byte[1024];
        int len = inputStream.read(b);
        System.out.println(new String(b,0,len));

        socket.close();






    }
}
