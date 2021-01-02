package day6;

import day6.Student;

public class Teacher {
    private String name;
    private String discipline;

    public Teacher(String name, String discipline) {
        this.name = name;
        this.discipline = discipline;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }
    String evaluation;
    public void evaluate(Student s) {
        int mark = (int) (Math.random() * 3 + 2);

        switch (mark) {
            case 2:
                evaluation = "неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + s.getName() + " по предмету " + discipline + " на оценку " + evaluation + ".");

    }
}
