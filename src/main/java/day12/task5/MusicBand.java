package day12.task5;

import java.util.List;

public class MusicBand {
    private String bandName;
    private int year;
    private List<MusicArtist> members;


    public String getBandName() {
        return bandName;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public MusicBand(String bandName, int year, List<MusicArtist> members) {
        this.bandName = bandName;
        this.year = year;
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "members=" + members +
                '}';
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (MusicArtist members : a.getMembers()) {
            b.getMembers().add(members);
        }
        a.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

}
