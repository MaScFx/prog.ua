package net.ukr.bior.lession2.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 25.06.2017.
 */
public class Lession1Level1Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        if (year%4==0 && (year%100!=0 || year%400==0)){
            System.out.println("In this year 366 days");
        } else {
            System.out.println("In this year 365 days");
        }
    }
}
