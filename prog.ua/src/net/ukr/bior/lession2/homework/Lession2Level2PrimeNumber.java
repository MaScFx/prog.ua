package net.ukr.bior.lession2.homework;

/**
 * Created by Administrator on 30.06.2017.
 */
public class Lession2Level2PrimeNumber {
    public static void main(String[] args) {
        int count =100;
        for (int i = 2; i <= count; i++) {
            if (prime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean prime(int number){
        int count=0;
        for (int i = 1; i <= number ; i++) {
         if (number%i==0){
             count++;
         }
        }
        if (count>2){
            return false;
        } else {
            return true;
        }


    }
}
