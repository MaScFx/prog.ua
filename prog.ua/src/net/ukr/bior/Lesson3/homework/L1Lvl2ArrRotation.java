package net.ukr.bior.Lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

public class L1Lvl2ArrRotation {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = j + 1;
            }
        }

        Scanner sc = new Scanner(System.in);
        int angle;
        while (true) {
            System.out.println("Enter angle - 90,180 or 270");
            angle = sc.nextInt();
            if (angle == 90 || angle == 180 || angle == 270) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {                //как было
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length / 2; i++) {
            rotationArr(arr, angle, i);
        }

        System.out.println("__________________________");     //как стало
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotationArr(int[][] mass, int angle, int iteration) {

        int[] horizontalTop = new int[mass.length];
        int[] horizontalDown = new int[mass.length];
        ;
        int[] verticalLeft = new int[mass.length];
        int[] verticalRight = new int[mass.length];
        if (angle == 90 || angle == 270) {
            for (int i = iteration; i < mass.length - iteration; i++) {
                horizontalTop[i] = mass[iteration][i];
                horizontalDown[i] = mass[mass.length - iteration - 1][i];
                verticalLeft[i] = mass[i][iteration];
                verticalRight[i] = mass[i][mass.length - iteration - 1];
            }

            for (int i = iteration; i < mass.length - iteration; i++) {
                if (angle == 90) {
                    mass[i][mass.length - iteration - 1] = horizontalTop[i];
                    mass[i][iteration] = horizontalDown[i];
                    mass[iteration][i] = verticalLeft[i];
                    mass[mass.length - iteration - 1][i] = verticalRight[i];
                }
                if (angle == 270) {
                    mass[mass.length - i - 1][iteration] = horizontalTop[i];
                    mass[mass.length - i - 1][mass.length - iteration - 1] = horizontalDown[i];
                    mass[mass.length - iteration - 1][i] = verticalLeft[i];
                    mass[iteration][i] = verticalRight[i];
                }
            }
        }

        if (angle == 180) {
            for (int i = 0; i < mass.length; i++) {
                verticalLeft[i] = mass[i][iteration];
                verticalRight[i] = mass[i][mass.length - iteration - 1];
            }

            for (int i = 0; i < mass.length; i++) {
                mass[i][iteration] = verticalRight[i];
                mass[i][mass.length - 1 - iteration] = verticalLeft[i];
            }
        }
        return mass;
    }
}
