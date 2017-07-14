package net.ukr.bior.Lesson4.HomeWork;

import java.util.Arrays;

/**
 * Created by Administrator on 12.07.2017.
 */
public class ArraysToStringInt {
    public static void main(String[] args) {
        int[] arr= new int[]{1,4,2,66,33,1,0,999,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(ArraysToString(arr));

    }

    public static StringBuilder ArraysToString(int[] arr){
        StringBuilder text= new StringBuilder("[");
        for (int x:arr){
            text.append((x)  +", ");
        }
        text.delete(text.length()-2,text.length());
        text.append("]");

        return text;
    }
}
