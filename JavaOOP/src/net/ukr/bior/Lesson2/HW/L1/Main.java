package net.ukr.bior.Lesson2.HW.L1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        Student student1= new Student("Ivanov", 7);
        Student student2= new Student("Petrov", 6);
        Student student3= new Student("Sidorov", 8);
        Student student4= new Student("Avgustin", 11);
        Student student5= new Student("Izold", 10);
        Student student6= new Student("Mortirasyan", 4);
        Student student7= new Student("Areva", 12);
        Student student8= new Student("Shufrin", 6);
        Student student9= new Student("Assasin", 11);
        Student student10= new Student("Velikij", 9);
        Student student11= new Student("Petrosyan", 5);
        try {
            group.addToGoroup(student1);
            group.addToGoroup(student2);
            group.addToGoroup(student3);
            group.addToGoroup(student4);
            group.addToGoroup(student5);
            group.addToGoroup(student6);
            group.addToGoroup(student7);
            group.addToGoroup(student8);
            group.addToGoroup(student9);
            group.addToGoroup(student10);
//            group.addToGoroup(student11);  //не лезет
        } catch (OutOfBoundGroupExeption e){
            System.err.println(e);
        }
        System.out.println(group.toString());

        System.out.println("________");
        group.delFromGroup(student1);
        group.delFromGroup(student2);
        group.delFromGroup(student4);
        try {
            System.out.println(group.findStudent("Ivanov").toString());
        } catch (NullPointerException e){
            e.printStackTrace();
        }

        group.toFile();


        System.out.println(group.toString());

    }
}
