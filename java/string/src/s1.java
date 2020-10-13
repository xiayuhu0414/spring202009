/*
* Java程序中的所有字符串字面值（如“abc")都作为此类的实列实现。
* 其实就是说：程序当中所有的双引号字符串，都是String类的对象。
* （就算没有new,也照样是。）
* 字符串的特点：
* 1.字符串的内容永不可变。
* 2.正是字符串不可改变，所以字符串是可以共享使用的。
* 3.字符串效果上相当于char[]字符数组，但是底层原理是byte[]字节数组。
*
* 创建字符串的常见4种方式。
* 三种构造方法：
* 一种直接创建：
* */

public class s1 {
    public static void main(String[] args) {
        //使用空参构造
        String str1= new String();//小括号留空，说明字符串内什么内容都没有。
        System.out.println("第一个字符串："+str1);

        //根据字符数组创建字符串
        char[] ch = {'A','B','C','D'};
        String str2 = new String(ch);
        System.out.println("第二个字符串："+str2);

        //根据字节数组创建字符串
        byte[] by = {97,98,99,100};
        String str3=new String(by);
        System.out.println("第三个字符串："+str3);

        String str4="JjJ";
        System.out.println("第四个字符串："+str4);
    }
}
