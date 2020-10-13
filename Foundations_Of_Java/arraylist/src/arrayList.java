import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("小红");
        list.add("小明");
        list.add("小白");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        ArrayList<Integer> list1 = new ArrayList<>();//包装类


    }
}
