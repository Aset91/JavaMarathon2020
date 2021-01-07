package day12;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("A");
        cars.add("B");
        cars.add("C");
        cars.add("D");
        cars.add("E");

        for(String s : cars) {
            System.out.print(s + ", ");
        }
        cars.add(2, "F");
        cars.remove(0);
        System.out.println();
        for(String s : cars) {
            System.out.print(s + ", ");
        }


    }
}
