package Lesson;

import java.io.Serializable;

/**
 * Created by Admin on 05.08.2017.
 */
public class Cat implements Cloneable,Serializable{
    private static final long serialVersionUID =1;
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat() {
        super();
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
    public Cat clone() throws CloneNotSupportedException {
         Cat clonaCat = (Cat)super.clone();
//         clonaCat.setAge(0);
        return clonaCat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (getAge() != cat.getAge()) return false;
        if (getName() != null ? !getName().equals(cat.getName()) : cat.getName() != null) return false;
        return getColor() != null ? getColor().equals(cat.getColor()) : cat.getColor() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        Main.cat2=this;
        System.out.println("Cat delete");
        super.finalize();
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
