package net.ukr.bior.lession2.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 25.06.2017.
 */
public class Lession2Level1Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rectangle width");
        int width=sc.nextInt();
        System.out.println("Enter height of rectangle");
        int height=sc.nextInt();

        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < width; j++) {
                if (i==0||i==height-1){
                    System.out.print("*");
                } else {
                    if (j==0||j==width-1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }


    }
}
