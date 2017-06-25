package net.ukr.bior.lession2.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 25.06.2017.
 */
public class Lession2Level1Wallpaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of cycle index ");
        int cycleIndex= sc.nextInt();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < cycleIndex; j++) {
                if (j%2==0){
                    System.out.print("***");
                } else {
                    System.out.print("+++");
                }
            }
            System.out.println();
        }
    }
}
