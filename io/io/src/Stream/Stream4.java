package Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 字符流：读取纯文本文件比较方便
 * 字符输入流
 * */
public class Stream4 {
    public static void main(String[] args) throws IOException {
        kk();
    }

    public static void kk() throws IOException {
        FileReader fr = new FileReader("F:\\123.txt");
       // BufferedReader xx = new BufferedReader(fr); 字符缓冲输入流
        char[] c = new char[1024];
        int len = 0;
        while ((len = fr.read(c)) != -1) {
            String str = new String(c, 0, len);
            System.out.println(str);
        }
        fr.close();
    }
}
