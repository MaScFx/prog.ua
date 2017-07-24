package net.ukr.bior.Lesson2.Lesson;

/**
 * Created by Admin on 22.07.2017.
 */
public class Cat implements Play,Comparable {
    private String name;
    private int age;
    private String color;

    public Cat() {
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String playWith() {
        if (this.age>7){
            return this.toString()+" go away, i want to sleep";
        } else {
            return this.toString() +" Jump, Jump, Jump!!";
        }
    }

//    @Override
//    public int compareTo(Object o) {
//        Cat anotherCat = (Cat) o;
//        if (this.age>anotherCat.getAge()){
//            return 1;
//        }
//        if ( this.age<anotherCat.getAge()){
//            return -1;
//        }
//        return 0;
//    }
    @Override
    public int compareTo(Object o) {
        Cat anotherCat = (Cat) o;
       return this.name.compareTo(anotherCat.getName());
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
