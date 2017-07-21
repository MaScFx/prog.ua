package net.ukr.bior.Lesson1.HW.part1.PhoneNet;

public class Phone {
    private Integer number;
    private Network phoneNet;

    public Phone(int number, Network phoneNet) {
        this.number = number;
        this.phoneNet = phoneNet;
    }

    public Phone() {
    }

    public void registration() {
        phoneNet.registration(number, Phone.this);
    }

    public void incomingCall(int number) {
        System.out.println("Incoming call - " + number);
    }

    public void call(int numberOfPhone) {
        if (phoneNet.realNumber(numberOfPhone) && numberOfPhone != Phone.this.getNumber()) {
            System.out.println("Call... Wait..");
            phoneNet.call(numberOfPhone);
        } else {
            System.out.println("Incorrect number!");
        }
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Network getPhoneNet() {
        return phoneNet;
    }

    public void setPhoneNet(Network phoneNet) {
        this.phoneNet = phoneNet;
    }
}
