package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Adam", "A");
        Teacher teacher = new Teacher ("Sergey", "Biology");
        student.printInfo();
        teacher.printInfo();
    }
}
