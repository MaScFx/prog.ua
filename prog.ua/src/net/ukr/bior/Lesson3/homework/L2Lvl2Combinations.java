package net.ukr.bior.Lesson3.homework;

import java.util.ArrayList;

/**
 * Created by Igor on 06.07.2017.
 */
public class L2Lvl2Combinations {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ArrayList<Integer> result = new ArrayList<>();
        int[] mass = new int[arr.length];
        ArrayList<Integer> index = new ArrayList<>();

        while (true) {
//            for (int i = 0; i < index.length; i++) {
//                index[i] = -1;
//            }
            for (int i = 0; i < arr.length; i++) {
                int temp = (int) Math.round((Math.random() * arr.length));
                index.clear();
                if (!index.contains(temp)) {
                    index.add(temp);
                } else {
                    i--;
                }

            }
            String t = "";
            for (int i = 0; i < index.size(); i++) {
                t += arr[index.get(i)-1];
            }
            print(t, result);
            System.out.println();

        }


    }

    public static void print(String num, ArrayList list) {
        if (!list.contains(num)) {
            list.add(num);
            System.out.print(num);
        }


    }
}
