package net.ukr.bior;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = cs.nextInt();
        System.out.println("Enter second number: ");
        int b = cs.nextInt();
        System.out.println("Enter third number: ");
        int c = cs.nextInt();
        System.out.println("Enter fourth number: ");
        int d = cs.nextInt();
        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }
        if (d >= max) {
            max = d;
        }
        System.out.println("Max number is: " + max);
    }
}

