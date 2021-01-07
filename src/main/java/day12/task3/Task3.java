package day12.task3;

import java.util.*;

public class Task3 {
    static List<MusicBand> bandsAfter2000 = new ArrayList<>();

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        for (MusicBand b : bands) {
            if (b.getYear() > 2000) {
                bandsAfter2000.add(b);
            }
        } return bandsAfter2000;
    }

    public static void main(String[] args) {
        List<MusicBand> band = new ArrayList<>();
        band.add(new MusicBand("A", 1996));
        band.add(new MusicBand("B", 1997));
        band.add(new MusicBand("C", 1998));
        band.add(new MusicBand("D", 1999));
        band.add(new MusicBand("E", 2000));
        band.add(new MusicBand("F", 2001));
        band.add(new MusicBand("G", 2002));
        band.add(new MusicBand("H", 2003));
        band.add(new MusicBand("I", 2004));
        band.add(new MusicBand("J", 2000));

        Collections.shuffle(band);

        for (MusicBand m : groupsAfter2000(band)) {
            System.out.println(m);
        }



    }


}
