package net.ukr.bior.Lesson3.homework;

/**
 * Created by Administrator on 01.07.2017.
 */
public class L1Lvl1OddNumber {
    public static void main(String[] args) {
        int[] mass= new int[]{0,5,2,4,7,1,3,19};
        int count=0;
        for (int i:mass) {
            if (i%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
