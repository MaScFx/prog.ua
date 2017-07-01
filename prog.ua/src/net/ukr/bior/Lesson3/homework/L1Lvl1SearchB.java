package net.ukr.bior.Lesson3.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 01.07.2017.
 */
public class L1Lvl1SearchB {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter text");
        String text= sc.nextLine();

        char[] arrCharText= text.toCharArray();
        int count=0;
        for (char i:arrCharText){
            if (i=='b')
                count++;
        }
        System.out.println(count);
    }
}
