package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeng", 2008, 20, 1500);
        airplane.setYear(2020);
        airplane.setLength(250);
        airplane.fillUp(50);
        airplane.fillUp(140);
        airplane.info();
    }
}
