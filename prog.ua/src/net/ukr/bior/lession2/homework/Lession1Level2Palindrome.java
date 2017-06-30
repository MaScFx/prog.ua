package net.ukr.bior.lession2.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 30.06.2017.
 */
public class Lession1Level2Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true){
            System.out.println("Enter ticket");
            number= sc.nextInt();
            if (number/100000>0 && number/100000<=9){
                break;
            }
        }
        if (polindromeTest(number)){
            System.out.println("polindrome");
        } else {
            System.out.println("not polindrome");
        }



    }

    public static boolean polindromeTest (int number){
        int one=number/100000;
        int two=number%100000/10000;
        int three=number%10000/1000;
        int four=number%1000/100;
        int five = number%100/10;
        int six = number%10;
        if (one==six && two==five && three==four){
            return true;
        } else {
            return false;
        }

    }
}
