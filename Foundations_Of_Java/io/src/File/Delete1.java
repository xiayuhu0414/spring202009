package File;

import java.io.File;

public class Delete1 {
    public static void main(String[] args) {
        File file = new File("E://练习");
        if (file.exists()) {
            dele(file);
        }
        System.out.println("该文件不存在或已删除");
    }

    public static void dele(File file) {

        if (file.isFile()) {
            System.out.println("删除" + file.getName());
            file.delete();
            //不是文件的话,就是文件夹
        } else {
            //获取文件夹中的所有File对象,如果为空,则files.length为0,次处程序不执行
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                //如果不为空,则显示显示删除的文件名称,继续调用递归
                System.out.println("删除" + files[i].getName());
                dele(files[i]);
            }
        }
        //最后删除空文件夹!!!
        file.delete();
    }

}
