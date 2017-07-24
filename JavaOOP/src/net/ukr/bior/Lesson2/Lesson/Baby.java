package net.ukr.bior.Lesson2.Lesson;

/**
 * Created by Admin on 22.07.2017.
 */
public class Baby {
    private String name;
    private int age;

    public Baby() {
    }

    public Baby(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void play(Play toy){
        System.out.println(" I play with "+ toy.playWith());
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

    @Override
    public String toString() {
        return "Baby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
