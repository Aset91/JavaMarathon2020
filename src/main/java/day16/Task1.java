package day16;

import java.io.*;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("textFile");
        Scanner scanner = new Scanner(file);
        double sum = 0;
        List<Double> digits = new ArrayList<>();
        while (scanner.hasNextDouble()) {
            digits.add(scanner.nextDouble());
        }
        for (Double i : digits) {
            sum += i;
        }
        double medium = sum / digits.size();

        System.out.println(medium);
        System.out.printf("%.3f", medium);
        scanner.close();
    }
}

