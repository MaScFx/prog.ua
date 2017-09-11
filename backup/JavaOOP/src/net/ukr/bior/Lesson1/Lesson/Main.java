package net.ukr.bior.Lesson1.Lesson;

/**
 * Created by Administrator on 17.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat(3, 0, true, "milk", "Vasiliy");
//		System.out.println(catOne.getAge());
//		System.out.println(catOne.hashCode());
        catOne.getVoice();
        System.out.println(catOne);

        print(catOne);

        Animal[] zoo = new Animal[10];
        zoo[0] = catOne;
        for (Animal animal : zoo) {
            System.out.println(animal);
        }
    }

    static void print(Animal a) {
        System.out.println(a);
        a.getVoice();
    }
}
