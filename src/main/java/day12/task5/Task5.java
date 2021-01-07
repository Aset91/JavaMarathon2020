package day12.task5;
import day12.task5.MusicBand;
import day12.task5.MusicArtist;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        MusicArtist mA1 = new MusicArtist("Z", 40);
        MusicArtist mA2 = new MusicArtist("S", 38);
        MusicArtist mA3 = new MusicArtist("K", 25);
        MusicArtist mA4 = new MusicArtist("M", 26);
        members1.add(mA1);
        members1.add(mA2);

        MusicBand mb1 = new MusicBand("ABC", 1991, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(mA3);
        members2.add(mA4);

        MusicBand mb2 = new MusicBand("BCD", 2020, members2);
        mb1.printMembers();
        mb2.printMembers();
        MusicBand.transferMembers(mb1, mb2);
        mb1.printMembers();
        mb2.printMembers();
    }
}
