package net.ukr.bior.lession2.homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 30.06.2017.
 */
public class Lession2Level2hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        while (true) {
            System.out.println("Enter number");
            count = sc.nextInt();
            if (count % 2 == 1) {
                break;
            }
        }
        ArrayList<String> arr=new ArrayList<>();
        for (int i = 0; i < count/2+1; i++) {
            arr.add(printer(i, count));
            System.out.println(arr.get(i));
        }
        for (int i = 0; i <arr.size()-1 ; i++) {
            System.out.println(arr.get(arr.size()-i-2));
        }

    }

    public static String printer(int i, int count) {
        String print = "";
            for (int j = 0; j < i; j++) {
                print += " ";
            }
            for (int j = 0; j < count - i * 2; j++) {
                print += "*";
            }
        return print;
    }
}