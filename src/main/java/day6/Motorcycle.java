package day6;

public class Motorcycle {
    private int year;
    private String color;
    private String model;

    public Motorcycle(int year, String color, String model) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }

}
