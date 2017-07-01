package net.ukr.bior.Lesson3.homework;

import java.util.Arrays;

/**
 * Created by Administrator on 01.07.2017.
 */
public class L1Lvl1RandomArrays {
    public static void main(String[] args) {
        int[] arr=new int[15];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= (int)(Math.random()*100);
        }

        int[] arrCopy= new int[arr.length*2];
        System.arraycopy(arr,0,arrCopy,0,arr.length);
        for (int i = 15; i < arrCopy.length; i++) {
            arrCopy[i]=arrCopy[i-15]*2;
        }

        System.out.println(Arrays.toString(arrCopy));
    }
}
