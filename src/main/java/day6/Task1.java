package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2002);
        car.setColor("Red");
        car.setModel("Lexus");
        Motorcycle motorcycle = new Motorcycle(2020, "Brown", "Porsche");
        car.info();
        System.out.println(car.yearDifference(2021));
        motorcycle.info();
        System.out.println(motorcycle.yearDifference(2021));


    }
}
