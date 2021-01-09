package day14;
import java.util.*;
import java.io.*;

public class Task3 {

    public static List<Person> parseFileToObjList(File file){
        List<Person> peopleList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] line = s.split(" ");

                if (Integer.parseInt(line[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                peopleList.add(new Person(line[0], Integer.parseInt(line[1])));
            }
                for (Person p : peopleList)
                    System.out.println(p);

        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IllegalArgumentException a) {
            System.out.println("Некорректный входной файл");
        } return null;
    }


    public static void main(String[] args) {
        File file = new File("people");
        parseFileToObjList(file);
    }
}
