package day3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            System.out.println(x / y);

            if (y == 0) {
                System.out.println("Деление на 0");
            }
        }
    }
}
