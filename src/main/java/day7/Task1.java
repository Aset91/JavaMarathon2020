package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane first = new Airplane("b", 123, 674, 8766);
        Airplane second = new Airplane("b", 123, 674, 8766);
        Airplane.compareAirplanes(first, second);

    }
}