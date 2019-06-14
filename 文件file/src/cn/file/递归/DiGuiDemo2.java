package cn.file.递归;

import java.io.File;

public class DiGuiDemo2 {

    public static void main(String[] args) {
        File file = new File("D:\\360");
        f(file);
    }


    private static void f(File file) {
        File[] files = file.listFiles();
        for(File f:files){
            //是否有目录
            if(f.isDirectory()){
                f(f);
            }else {
                //文件
                //获得文件名
                String name = f.getName();

                if(name.endsWith(".java")){
                    System.out.println(name);
                }

            }
        }
    }
}
