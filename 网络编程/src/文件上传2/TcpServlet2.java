package 文件上传2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServlet2 {

    public static void main(String[] args) throws IOException {

        //创建服务端
       ServerSocket serverSocket = new ServerSocket(8888);


        //保持服务端开启
        while (true){
            Socket socket = serverSocket.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //获得客户端

                        OutputStream os = socket.getOutputStream();
                        InputStream in = socket.getInputStream();

                        File file=new File("D:\\360");
                        if(!file.exists()){
                            file.mkdirs();
                        }

                        long v = (long) (Math.random() * 1000000000);
                        String str="\\"+v+".jpg";
                        FileOutputStream fs = new FileOutputStream(file+str);

                        //读取
                        byte[] bytes=new byte[1024];
                        int len=0;
                        while ((len=in.read(bytes))!=-1){
                            fs.write(bytes,0,len);
                        }

                        //响应给客户端
                        os.write("上传成功".getBytes());

                        os.close();
                        in.close();
                        fs.close();
                        socket.close();
                    }catch (Exception e){

                    }
                }
            }).start();

        }

    }
}
