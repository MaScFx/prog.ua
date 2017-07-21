package net.ukr.bior.Lesson1.HW.part1.PhoneNet;

import java.util.HashMap;

public class Network {
    private HashMap<Integer, Phone> numberData = new HashMap<Integer, Phone>();

    public Network(HashMap<Integer, Phone> numberData) {
        this.numberData = numberData;
    }

    public Network() {
    }

    public void registration(int number, Phone phone) {
        if (number / 10000000 < 1) {          //Нет второй проверки, потому что если номер телефона будет 0001122, то в int сохранится только 1122.
            numberData.put(number, phone);
            System.out.println("Phone was registered");
        } else {
            System.out.println("Number is not correct");
        }
    }

    public boolean realNumber(int numberOfPhone) {
        for (int num : numberData.keySet()) {
            if (num == numberOfPhone) {
                return true;
            }
        }
        return false;
    }

    public void data() {
        for (int num : numberData.keySet()) {
            System.out.println(num);
        }
    }

    public void call(int numberOfPhone) {
        numberData.get(numberOfPhone).incomingCall(numberOfPhone);
    }

    public HashMap<Integer, Phone> getNumberData() {
        return numberData;
    }

    public void setNumberData(HashMap<Integer, Phone> numberData) {
        this.numberData = numberData;
    }
}
