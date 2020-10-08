package Stream;

import sun.security.util.Length;

import java.io.*;

/*
 * 文件复制
 * */
public class Stream3 {
    public static void main(String[] args) {
        am();
    }

    public static void am() {
        File fi = new File("F:\\坠欢莫拾，酒痕在衣。\\大三上学期\\网络营销\\123.mp4");
        File ff = new File("E:\\2344.mp4");
        try {
            FileInputStream f = new FileInputStream(fi);
            BufferedInputStream z = new BufferedInputStream(f);//字节缓冲输入流
            FileOutputStream i = new FileOutputStream(ff);
            BufferedOutputStream c = new BufferedOutputStream(i);//字节缓冲输出流
            byte[] cc =new byte[1024];
            int ch =0;
            while ((ch = z.read(cc)) != -1) {
                c.write(cc);
            }
            z.close();
            c.close();

           /* FileInputStream f = new FileInputStream(fi);
            FileOutputStream i = new FileOutputStream(ff);
            f.read();
            int ch = 0;
            while ((ch = f.read()) != -1) {
                i.write(ch);
            }
            f.close();
            i.close();*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
