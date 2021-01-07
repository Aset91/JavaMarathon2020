package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("A");
        members1.add("B");

        MusicBand mb1 = new MusicBand("ABC", 1991, members1);

        List <String> members2 = new ArrayList<>();
        members2.add("C");
        members2.add("D");

        MusicBand mb2 = new MusicBand("BCD", 2002, members2);
        mb1.printMembers();
        mb2.printMembers();
        MusicBand.transferMembers(mb1, mb2);
        mb1.printMembers();
        mb2.printMembers();

    }
}
