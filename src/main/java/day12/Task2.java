package day12;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 30; i += 2) {
            numbers.add(i);
        }
        for (int i = 300; i <= 350; i += 2) {
            numbers.add(i);
        }
        for (Integer x : numbers) {
            System.out.println(x);
        }

    }
}
