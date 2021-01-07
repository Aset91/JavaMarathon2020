package day12.task4;

import java.util.*;

public class MusicBand {
    private String bandName;
    private int year;
    private List<String> members;

    public String getBandName() {
        return bandName;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public MusicBand(String bandName, int year, List<String> members) {
        this.bandName = bandName;
        this.year = year;
        this.members = members;
    }

    @Override
    public String toString() {
        return "members= " + members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (String members : a.getMembers()) {
            b.getMembers().add(members);
        }
        a.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

}
