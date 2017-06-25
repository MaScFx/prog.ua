package net.ukr.bior.lession2.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 25.06.2017.
 */
public class Lession2Level1Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter factorial");
        int f= sc.nextInt();
        System.out.println(factorial(f));

    }
    static int factorial(int f){
        return f==1 ? 1:f*factorial(f-1);
    }
}
