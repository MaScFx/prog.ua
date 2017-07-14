package net.ukr.bior.Lesson4.HomeWork;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class L2Lvl1ArrayInTxtFile {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = j + i;
            }
        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
        arrToFile(arr);

    }

    public static void arrToFile(int[][] arr) {
        File file = new File("L2Lvl1Arr");
        try (PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < arr.length; i++) {

                pw.println(Arrays.toString(arr[i]));
            }
            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
