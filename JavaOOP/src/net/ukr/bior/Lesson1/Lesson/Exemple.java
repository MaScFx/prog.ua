package net.ukr.bior.Lesson1.Lesson;

/**
 * Created by Administrator on 17.07.2017.
 */
public class Exemple {
    public static void main(String[] args) {
        Car carOne = new Car();
        carOne.setColor("Green");
        carOne.setWeight(2000);
        ;
        carOne.setYear(1985);

        Car[] carArray = new Car[10];

        Car carTwo = new Car();

        Car carThree = new Car("blue", 1700, 1995);
        System.out.println(carOne.toString());
    }
}
