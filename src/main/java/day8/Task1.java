package day8;

public class Task1 {
    public static void main(String[] args) {
        String x = " ";
        for (int i = 0; i <= 2000; i++) {
            System.out.print(i + x);
        }
        StringBuilder b = new StringBuilder();
        for (int i = 0; i <= 2000; i++) {
            b.append(i).append(" ");
        }
        System.out.println();
        System.out.print(b.toString());

    }
}
