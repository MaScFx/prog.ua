package net.ukr.bior.Lesson1.HW.part1;

public class L1Lvl1Cat {
    public static void main(String[] args) {
        Cat catVasiliy = new Cat("Vasiliy", 4, "milk, meat, fish", true);
        Cat catMurzic = new Cat("Murzic", 6, "milk, meat", true);
        Cat catFiona = new Cat("Fiona", 2, "milk, fish", false);
        System.out.println(catVasiliy.toString());
        System.out.println(catMurzic.meow());
        System.out.println(catFiona.toString());
    }

}
