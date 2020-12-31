package day4;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int countMore8 = 0;
        int equals1 = 0;
        int even = 0;
        int uneven = 0;
        int sum = 0;
        int a;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
             array[i] = (int)(Math.random() * 10);
        }
        for (int d : array) {
            System.out.print(d + ", ");
            if (d > 8) {
                countMore8++;
            }
            if (d == 1) {
                equals1++;
            }
            if (d % 2 == 0 ) {
                even++;
            }
            if (d % 2 != 0) {
                uneven++;
            }
            sum += d;
        }
        System.out.println();
        System.out.println(array.length);
        System.out.println(countMore8);
        System.out.println(equals1);
        System.out.println(even);
        System.out.println(uneven);
        System.out.println(sum);


    }
}
