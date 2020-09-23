package File;

import java.io.*;

public class FileCreate {
    public static void main(String[] args) {
        // 创建文件
        File f = new File("m.txt");
        try {
            if (!f.exists())
                f.createNewFile();
            //写入的过程
            FileWriter fw = new FileWriter(f);//为文件建立写入字符流
            BufferedWriter bw = new BufferedWriter(fw);//为写入字符流建立缓存流
            bw.write("java是最流行的语言");//写入字符串
            bw.flush();//刷新提交
            bw.close();
            fw.close();
            //读取的过程
            FileReader fr = new FileReader(f);//为文件建立读取字符流
            BufferedReader br = new BufferedReader(fr);//为读取字符建立缓存流
            String temp = null;
            while ((temp = br.readLine()) != null)//循环读取每一行，直到null
                System.out.println(temp);
            br.close();
            fr.close();

        } catch (Exception e) {
            System.out.println("创建文件失败");
        }

        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
        System.out.println(f.length());
    }
}

