package day16;

import java.io.*;
import java.util.*;

public class Task2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file1 = new File("file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            pw1.println(random.nextInt(100));
        }
        pw1.close();
        double sum = 0.0;
        int counter = 0;
        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);

        while (scanner.hasNextLine()) {
            sum += Double.parseDouble(scanner.nextLine());
            counter++;
            if (counter == 20) {
                pw2.println(sum / 20);

                sum = 0;
                counter = 0;
            }
        }
        scanner.close();
        pw2.close();
        Scanner scanner2 = new Scanner(file2);
        int finalSum = 0;
        while (scanner2.hasNextLine()) {
            finalSum += (int) Double.parseDouble(scanner2.nextLine());
        }
        scanner2.close();
        System.out.println(finalSum);
    }
}

