package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10000);
        }

        int sum = 0;
        int sumMax = 0;
        int maxSumId = 0;
        for (int i = 0; i < a.length - 2; i++) {
            sum = a[i] + a[i + 1] + a[i + 2];

            if (sumMax <= sum) {
                sumMax = sum;
                maxSumId = i;
                System.out.println(sumMax);
                System.out.println(maxSumId);
            }
        }
    }
}
