package day11.task1;

public class Picker implements Worker {
    private double salary = 0;
    private double salaryPlus = 80;
    private boolean isPayed;
    private Warehouse w;
    private double bonus = 70000;

    public Picker(Warehouse w) {
        this.w = w;
    }

    public Picker(double salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += salaryPlus;
        w.incrementPickedOrders();
    }

    public void bonus() {
        if (w.getCountPickedOrders() == 10000) {
            salary += bonus;
            isPayed = true;
        } else if (w.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (isPayed = true) {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
