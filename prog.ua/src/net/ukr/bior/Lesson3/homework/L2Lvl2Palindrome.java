package net.ukr.bior.Lesson3.homework;

/**
 * Created by Igor on 06.07.2017.
 */
public class L2Lvl2Palindrome {
    public static void main(String[] args) {
        int palindrome = 0;
        int a = 0;
        int b = 0;
        for (int i = 100; i < 999; i++) {
            for (int j = 100; j < 999; j++) {
                int temp = i * j;
                if (pal(temp) && temp > palindrome) {
                    palindrome = temp;
                    a = i;
                    b = j;
                }
            }
        }


        System.out.println("1st number = " + a + ", 2st number = " + b + " palindrome= " + palindrome);
    }

    public static boolean pal(int num) {
        if (num / 100000 == num % 10 && num % 100000 / 10000 == num % 100 / 10 && num % 10000 / 1000 == num % 1000 / 100) {
            return true;
        } else {
            return false;
        }
    }

}
