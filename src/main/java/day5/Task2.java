package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorcycle motor = new Motorcycle(2020, "Red", "Lexus");
        System.out.println("Year: " + motor.getYear() + ",\nColor: " + motor.getColor() + ",\nModel: " + motor.getModel());
    }
}
