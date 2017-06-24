package net.ukr.bior.lession2.homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 25.06.2017.
 */
public class Lession1Level1MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Input number " + (i + 1));
            arr.add(sc.nextInt());
        }
        int max = arr.stream().max(Integer::compareTo).get();
        System.out.println(max);

    }
}
