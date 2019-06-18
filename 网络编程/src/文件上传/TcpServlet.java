package 文件上传;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServlet {

    public static void main(String[] args) throws IOException {
        //获得服务器对象
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true){
            //获得客户端  注意获得的客户端放到线程外部
            Socket socket = serverSocket.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //读取客户端的文件
                        InputStream inputStream = socket.getInputStream();

                        //\
                        File file = new File("D:\\360");
                        if(!file.exists()){
                            file.mkdirs();
                        }

                        //写活的
                        long fh= (long) (Math.random()*1000000);
                        String s="\\"+fh+".jpg";
                        FileOutputStream fos=new FileOutputStream(file+s);

                        byte[] by=new byte[1024];
                        int len=0;
                        while ((len=inputStream.read(by))!=-1){
                            fos.write(by,0,len);
                        }


                        //回显给客户端
                        socket.getOutputStream().write("上传成功".getBytes());

                        socket.close();
                    }catch (Exception e){

                    }
                }
            }).start();

        }


    }
}
