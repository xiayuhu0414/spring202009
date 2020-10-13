public class String2 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] char1 = {
                'a', 'b', 'c'
        };
        String str3 = new String(char1);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);


    }
}
