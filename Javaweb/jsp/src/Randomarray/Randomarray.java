package Randomarray;

public class Randomarray {
    public static void main(String[] args) {
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.ceil(Math.random() * 1000);
        }
        int max = a[0];
        int min = a[0];
        for (int j = 0; j < a.length; j++) {
            if (a[j] > max) {
                max = a[j];
            }
            if (a[j] < min) {
                min = a[j];
            }
            System.out.print(a[j]+" ");
        }
        System.out.println("max="+max+"  "+"min="+min);
    }
}
