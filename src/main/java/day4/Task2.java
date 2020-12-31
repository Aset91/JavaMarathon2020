package day4;

public class Task2 {
    public static void main(String[] args) {

        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10000);
        }
        double max = a[1];
        double min = a[0];
        int roundNum = 0;
        int sum = 0;

        for (int x : a) {
            if (max < x) {
                max = x;
            }
        }
        System.out.println(max);

        for (int x : a) {
            if (min > x) {
                min = x;
            }
        }
        System.out.println(min);
        for (int x : a) {
            if (x % 10 == 0) {
                roundNum++;
                sum += x;
            }
        }
        System.out.println(roundNum);
        System.out.println(sum);
    }
}


