package File;

import sun.awt.geom.AreaOp;
/*
* 文件的创建
* */
import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {
        try {
            //创建文件
            File file1 = new File("E:\\1236.txt");
            if (file1.exists()) {
                System.out.println("文件已存在");
            } else {
                boolean flage = file1.createNewFile();
                System.out.println(flage ? "创建成功" : "创建失败");
            }
            //创建单个文件夹
            File file2 = new File("E:\\练习");
            if (file2.exists()) {
                System.out.println("文件夹已存在");
            } else {
                boolean flage = file2.mkdir();
                System.out.println(flage ? "文件夹创建成功" : "文件夹创建失败");
            }
            //创建多级文件夹
            File file3 = new File("E:\\练习\\1\\2\\3");
            if (file3.exists()) {
                System.out.println("文件夹已存在");
            } else {
                boolean flage = file3.mkdirs();
                System.out.println(flage ? "文件夹创建成功" : "文件夹创建失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
