package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setColor("Red");
        car.setModel("Lexus");
        System.out.println("Year: " + car.getYear() + ",\nColor: " + car.getColor() + ",\nModel: " + car.getModel());

    }
}
