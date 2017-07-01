package net.ukr.bior.Lesson3;

import java.util.Arrays;

/**
 * Created by Igor on 01.07.2017.
 */
public class L3 {
    public static void main(String[] args) {
        int[] a = new int[]{3,5,-2};
        System.out.println(Arrays.toString(a));
        int summ=getSumFromArray(a);
        System.out.println(Arrays.toString(a));





//        int a=3;
//        int b= 5;
//        System.out.println("a main= "+a);
//        int c= getSumm(a,b);
//        System.out.println("c= "+c);
//        System.out.println("a main= "+a);

    }

    public static int getSumm(int a, int b){ //примитивный тип
        a=a+3;
        int summ = a+b;
        return a;
    }
    public static int getSumFromArray(int[] array){ //ссылочный тип
        int summ=0;
        array[0]+=3;
        for (int i:array){
            summ+=i;
        }
        return summ;
    }

}
