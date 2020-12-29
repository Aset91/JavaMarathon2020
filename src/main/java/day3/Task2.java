package day3;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            if (y == 0) {
                break;
            } else {
                System.out.print(x / y);
                break;
            }

        }

    }
}
