package Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static Stream.Stream1.str;

/*
 * 字节输出流
 * */
public class Stream2 {
    public static void main(String[] args) throws IOException {
        stt();
        // 利用输入流查看
        File f = new File("F:\\234.txt");
        str(f);
    }

    public static void stt() throws IOException {
        try {
            String data = "111111111";
            File fi = new File("F:\\234.txt");
            FileOutputStream fo = new FileOutputStream(fi, true);
            byte[] tb = data.getBytes();
            fo.write(tb);
            fo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
