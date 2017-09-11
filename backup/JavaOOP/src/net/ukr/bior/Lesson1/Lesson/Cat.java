package net.ukr.bior.Lesson1.Lesson;

/**
 * Created by Administrator on 17.07.2017.
 */
public class Cat extends Animal{
    private String name;

    public Cat(int age, double weigt, boolean sex, String ration, String name) {
        super(age, weigt, sex, ration);
        this.name = name;
        System.out.println("Cat create");
    }

    public Cat() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getVoice() {
        System.out.println("may-may");
    }

    @Override
    public String toString() {

        return "Cat [name=" + name + "]"+super.toString();
    }
}
