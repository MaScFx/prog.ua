package net.ukr.bior.Lesson2.HW.L1;

public class Student extends Human {
    private String secondName;
    private String group;
    private double avrRating;

    public Student() {
    }

    public Student(String secondName, double avrRating) {
        this.secondName = secondName;
        this.avrRating = avrRating;
    }

    public Student(int age, String name, boolean sex) {
        super(age, name, sex);
    }

    public Student(String secondName, String group, double avrRating) {
        this.secondName = secondName;
        this.group = group;
        this.avrRating = avrRating;
    }

    public Student(int age, String name, boolean sex, String secondName, String group, double avrRating) {
        super(age, name, sex);
        this.secondName = secondName;
        this.group = group;
        this.avrRating = avrRating;
    }

    @Override
    public String toString() {
        return "This student learn in "+group+ " group, and have average rating - "+avrRating;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAvrRating() {
        return avrRating;
    }

    public void setAvrRating(double avrRating) {
        this.avrRating = avrRating;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
