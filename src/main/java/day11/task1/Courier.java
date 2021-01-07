package day11.task1;

public class Courier implements Worker {
    private double salary = 0;
    private double salaryPlus = 100;
    private boolean isPayed;
    private Warehouse w;
    private double bonus = 50000;

    public Courier(Warehouse w) {
        this.w = w;
    }

    public Courier(double salary, boolean isPayed) {
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
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public void doWork() {
        salary += salaryPlus;
        w.incrementDeliveredOrders();
    }

    public void bonus() {
        if (w.getCountDeliveredOrders() == 10000) {
            salary += bonus;
            isPayed = true;
        } else if (w.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (isPayed = true) {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
