package day15;

import java.io.*;
import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        List<String> shoesList = new ArrayList<>();
        try {
            File firstFile = new File("src/main/resources/shoes.csv");
            File secondFile = new File("src/main/resources/missing_shoes");
            Scanner scanner = new Scanner(firstFile);
            PrintWriter writer = new PrintWriter(secondFile);

            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] splitedList = str.split(";");
                if (Integer.parseInt(splitedList[2]) == 0) {
                    writer.println(splitedList[0] + ", " + splitedList[1] + ", " + splitedList[2]);
                }

            }
            scanner.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}
