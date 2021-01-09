package day14;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;

import java.io.*;
import java.util.*;

public class Task1 {


    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String s = scanner.nextLine();
            String[] strings = (s.split(" "));
            if (strings.length != 10) {
                throw new Not10DigitsException();
            }
            int[] x = new int[strings.length];
            int sum = 0;
            for (int i = 0; i < x.length; i++) {
                x[i] = Integer.parseInt(strings[i]);
            }
            for (int i : x) {
                sum += i;
            }
            System.out.println(sum);

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Not10DigitsException n) {
            System.out.println("Некорректный входной файл");
        }

    }

    public static void main(String[] args) throws IOException {
        File fileName = new File("textFile");
        printSumDigits(fileName);

    }
}


