package net.ukr.bior.lession2.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 25.06.2017.
 */
public class Lession1Level2Circle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter X");
        int x=sc.nextInt();
        System.out.println("Enter Y");
        int y=sc.nextInt();
        double distance = Math.sqrt(x*x+y*y);
        if (distance<=4){
            System.out.println("inside");
        } else {
            System.out.println("outside");
        }
    }
}
