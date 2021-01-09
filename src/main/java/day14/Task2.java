package day14;

import java.util.*;
import java.io.*;

public class Task2 {

    public static List<String> parseFileToStringList(File file) {
        try {
            List<String> peopleList = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String p = scanner.nextLine();
                peopleList.add(p);

                String[] line = p.split(" ");
                if (Integer.parseInt(line[1]) < 0) {
                    throw new IllegalArgumentException();
                }
            }
            for (String s : peopleList) {
                System.out.println(s);
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (
                IllegalArgumentException a) {
            System.out.println("Некорректный входной файл");
        }
        return null;

    }


    public static void main(String[] args) {
        File file = new File("people");
        parseFileToStringList(file);

    }
}
