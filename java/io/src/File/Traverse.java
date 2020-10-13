package File;

import java.io.File;

/*
 * 遍历文件夹
 * */
public class Traverse {
    public static void main(String[] args) {
        File file = new File("F:\\");
        if (file.isDirectory()) {
            tr(file);
        }
        System.out.println("请选择一个文件夹！");
    }

    public static void tr(File file) {
        File[] files = file.listFiles();
        if (files != null)
            for (int i = 0; i < files.length; i++) {
                System.out.println("文件----------------------" + files[i].getName());
                tr(files[i]);
            }
    }
}


