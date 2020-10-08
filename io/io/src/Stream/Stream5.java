package Stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
* 字符输出流
* */
public class Stream5 {
    public static void main(String[] args) {

    }
    public static void ss(){
        try {
            FileWriter hh = new FileWriter("");
           // BufferedWriter dd = new BufferedWriter(hh); 字符缓冲输出流
            hh.write("");
            hh.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
