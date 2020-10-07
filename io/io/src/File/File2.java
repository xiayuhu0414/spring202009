package File;

import java.io.File;

/*
 * 文件的删除
 * */
public class File2 {
    public static void main(String[] args) {

        //多层文件夹只能逐层删除
        File fl = new File("E:\\1236.txt");
        if (fl.exists()) {
            boolean flage = fl.delete();
            System.out.println(flage ? "已删除" : "删除失败");
        } else {
            System.out.println("不存在");
        }
    }

}

