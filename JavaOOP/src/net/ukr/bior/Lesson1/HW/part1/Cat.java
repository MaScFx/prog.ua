package net.ukr.bior.Lesson1.HW.part1;

/**
 * Created by Administrator on 17.07.2017.
 */
public class Cat {
    private String name;
    private int age;
    private String ration;
    private boolean sex;

    public String meow() {
        return "Meow!!!";
    }

    public Cat(String name, int age, String ration, boolean sex) {
        this.name = name;
        this.age = age;
        this.ration = ration;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cat [Name = " + name + ", sex = " + (sex ? "male, " : "female, ") + age + " years old and ration is " + ration + "]";
    }


    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
