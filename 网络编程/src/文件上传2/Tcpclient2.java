package 文件上传2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Tcpclient2 {

    public static void main(String[] args) throws IOException {

        //创建客户端
        Socket socket = new Socket("127.0.0.1", 8888);

        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();

        //读取本地的文件
        FileInputStream fs=new FileInputStream("D:\\360\\250\\1.jpg");
        byte[] bytes=new byte[1024];
        int len;
        while ((len=fs.read(bytes))!=-1){
            os.write(bytes,0,len);
        }

        //解开阻塞
        socket.shutdownOutput();


        //读取服务器返回的数据
        byte[] bytes1=new byte[1024];
        int len2=0;
        while ((len2=is.read(bytes1))!=-1){
            System.out.println(new String(bytes1,0,len2));
        }

        fs.close();
        os.close();
        is.close();
        socket.close();

    }
}
