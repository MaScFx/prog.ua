package net.ukr.bior.Lesson3.homework;

import java.util.Arrays;

public class L1Lvl2Mirror {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 9, 4};
        System.out.println("Old array - " + Arrays.toString(arr));
        mirror(arr);
        System.out.println("New array - " + Arrays.toString(arr));
    }

    public static int[] mirror(int[] mass) {
        for (int i = 0; i < mass.length / 2; i++) {
            int tempA = mass[i];
            int tempB = mass[mass.length - 1 - i];
            mass[i] = tempB;
            mass[mass.length - 1 - i] = tempA;
        }
        return mass;
    }
}
