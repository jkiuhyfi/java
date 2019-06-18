package cn.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TcpService {

    public static void main(String[] args) throws IOException {
        //创建服务器
        ServerSocket socket = new ServerSocket(8888);
        //获得客户端对象
        Socket accept = socket.accept();

        InputStream is = accept.getInputStream();

        byte[] b=new  byte[1024];
        int read = is.read(b);
        System.out.println(new String(b,0,read));

        //回写
        OutputStream os = accept.getOutputStream();
        //
        os.write("服务端".getBytes());
        socket.close();
        accept.close();


    }
}
