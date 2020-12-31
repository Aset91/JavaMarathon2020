package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] a = new int[12][8];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 50);
            }
        }
        int maxSum = 0;
        int maxInd = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxInd = i;
            }
        }
        System.out.println(maxInd);
    }
}
