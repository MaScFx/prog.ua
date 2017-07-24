package net.ukr.bior.Lesson2.Lesson;

import java.util.Arrays;

/**
 * Created by Admin on 22.07.2017.
 */
public class L2Main {
    public static void main(String[] args) {
        Baby baby= new Baby("Name", 1);
        Cat cat1 = new Cat("Vaska", 3,"Black");
        Cat cat2 = new Cat("Umka", 8,"white");
        Cat cat3 = new Cat("ivan", 2,"Gray");
        Cat cat4 = new Cat("serega", 4,"Gray");
        Cat cat5 = new Cat("azaza", 1,"blue");

        Cat[] catArray = new Cat[]{cat1,cat2,cat3,cat4,cat5};

        for (Cat cat :catArray){
            System.out.println(cat);
        }
        System.out.println("________________");


        Arrays.sort(catArray);


        for (Cat cat :catArray){
            System.out.println(cat);
        }



//        baby.play(cat1);
//        baby.play(cat2);
//
//        Ball ball = new Ball("Blue", 13);
//        baby.play(ball);

    }
}
