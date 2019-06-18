package 文件上传;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Tcpclient1 {

    public static void main(String[] args) throws Exception {

        //读取文件
        FileInputStream fs = new FileInputStream("D:\\360\\250\\1.jpg");
        //创建客户端
        Socket socket = new Socket("127.0.0.1", 8888);

        OutputStream os = socket.getOutputStream();

        //获得本地的数据源
        byte[] by=new byte[1024];
        int len=0;
        while ((len=fs.read(by))!=-1){
            os.write(by,0,len);
        }

        socket.shutdownOutput();//解除阻塞状态
        //读取服务器
        InputStream in = socket.getInputStream();
        byte[] b=new byte[1024];
        int len1=0;
        while ((len1=in.read(b))!=-1){
            System.out.println(new String(b,0,len1));
        }

        fs.close();
        socket.close();




    }
}
