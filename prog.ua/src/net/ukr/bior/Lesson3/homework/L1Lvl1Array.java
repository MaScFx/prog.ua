package net.ukr.bior.Lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 01.07.2017.
 */
public class L1Lvl1Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int[] arr= new int[sc.nextInt()];

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter "+(i+1)+" element");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
