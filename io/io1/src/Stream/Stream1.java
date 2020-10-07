package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

/*
 * 字节输入流
 * */
public class Stream1 {
    public static void main(String[] args) {
        str();
    }

    public static void str() {
        try {
            File fi = new File("F:\\坠欢莫拾，酒痕在衣。\\大三上学期\\网络营销\\123.mp4");
            if (fi.exists()) {
                System.out.println("文件已确认，准备传输。");
                if (fi.length() != 0) {
                    FileInputStream fil = new FileInputStream(fi);
                    fil.read();
                    int ch = 0;
                    while ((ch = fil.read()) != -1) {
                        System.out.print(" " + (char) ch);
                    }
                    fil.close();
                    System.out.println("文件传输完成！");
                } else System.out.println("空文件！");
            } else System.out.println("文件不存在！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
