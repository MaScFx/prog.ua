package net.ukr.bior.lession2.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 25.06.2017.
 */
public class Lession1Level1Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side of triangle");
        double sideA= sc.nextDouble();
        System.out.println("Enter second side of triangle");
        double sideB= sc.nextDouble();
        System.out.println("Enter third side of triangle");
        double sideC= sc.nextDouble();

        if ((sideA+sideB > sideC) && (sideA+sideC > sideB) && (sideB+sideC > sideA)){
            System.out.println("It`s true triangle");
        } else {
            System.out.println("It`s false triangle");
        }

    }
}
