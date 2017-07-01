package net.ukr.bior.Lesson3;

/**
 * Created by Igor on 01.07.2017.
 */
public class L2 {
    public static void main(String[] args) {

    }
    public static int CalcSum(int a, int b){
        return a+b;
    }
    public static int CalcSum(int a, int b, int c){
        return a+b+c;
    }

    public static int CalcSum(int... array){
        int summ=0;
        for (int i:array){
            summ+=i;
        }

        return summ;
    }



}
