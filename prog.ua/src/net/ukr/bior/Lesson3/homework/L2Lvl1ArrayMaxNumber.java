package net.ukr.bior.Lesson3.homework;

/**
 * Created by Administrator on 01.07.2017.
 */
public class L2Lvl1ArrayMaxNumber {
    public static void main(String[] args) {
    }

    public static int maxNumber(int[] array){
        int max=array[0];
        for (int i:array){
            if (i>max)
                max=i;
        }
        return max;
    }


}
