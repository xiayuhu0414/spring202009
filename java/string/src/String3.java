/*
* public boolean equals(Object obj): 参数可以是任何对象，只有参数是一个字符串并且内容相同的
才会给ture;否则返回false。
备注：任何对象都能用Object进行接收。
      equals方法具有对称性，也就是a.equals(b)和b.quals(a)效果一样。
      如果比较双方一个常量一个变量，推荐把常量字符写在前面。
推荐　＂abc＂.equals(str)     不推荐:str.equals("abc")
*
* public boolean equalsIgnoreCase(String str):
* */
public class String3 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        char[] ch = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(ch);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        String str4 = "hello";
        System.out.println(str1.equals(str4));
        System.out.println("================");

        String str5 = null;
        System.out.println("abc".equals(str5));
        //  System.out.println(str5.equals("abc")); 不推荐：报错，空指针异常NullPointerException
        System.out.println("================");

        String strA="JAVA";
        String strB="java";
        System.out.println(strA.equals(strB));//严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));//忽略大小写
    }
}
