package net.ukr.bior.Lesson1.HW.part1.PhoneNet;

import net.ukr.bior.Lesson1.HW.part1.PhoneNet.Network;
import net.ukr.bior.Lesson1.HW.part1.PhoneNet.Phone;

public class Main {
    public static void main(String[] args) {
        Network myNetwork = new Network();

        Phone phone1 = new Phone(1112233, myNetwork);
        Phone phone2 = new Phone(1112244, myNetwork);
        Phone phone3 = new Phone(1112255, myNetwork);
        Phone phone4 = new Phone(1112266, myNetwork);
        Phone phone5 = new Phone(1112277, myNetwork);
        phone1.registration();
        phone2.registration();
        phone3.registration();
        phone4.registration();
        phone5.registration();

        phone1.call(1112277);
        System.out.println("_________________");
        phone2.call(1112244);  //сам себе
        System.out.println("_________________");
        phone3.call(3344411);  //неверный номер
        System.out.println("_________________");
        phone5.call(1112255);

    }
}
