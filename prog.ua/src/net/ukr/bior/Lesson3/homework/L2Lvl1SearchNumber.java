package net.ukr.bior.Lesson3.homework;

/**
 * Created by Administrator on 01.07.2017.
 */
public class L2Lvl1SearchNumber {
    public static void main(String[] args) {
    }
    public static int searchNumber(int[] arr, int num ){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
