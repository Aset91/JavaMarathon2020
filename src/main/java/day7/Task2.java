package day7;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random(6);
        Player player1 = new Player((int) (Math.random() * 10 + 90));
        Player player2 = new Player((int) (Math.random() * 10 + 90));
        Player player3 = new Player((int) (Math.random() * 10 + 90));
        Player player4 = new Player((int) (Math.random() * 10 + 90));
        Player player5 = new Player((int) (Math.random() * 10 + 90));
        Player player6 = new Player((int) (Math.random() * 10 + 90));

        Player.info();

        while (player1.getStamina() != 0) {
            player1.run();
        }
        System.out.println(Player.countPlayers);

    }
}
