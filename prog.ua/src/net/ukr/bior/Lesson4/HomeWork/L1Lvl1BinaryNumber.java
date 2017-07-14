package net.ukr.bior.Lesson4.HomeWork;

import java.util.Scanner;

/**
 * Created by Administrator on 12.07.2017.
 */
public class L1Lvl1BinaryNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String number;

        while (true){
            System.out.println("Enter binary Number");
            number=sc.nextLine();
            int count=0;
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i)=='1'||number.charAt(i)=='0'){
                    count++;
                }
            }
            if (count==number.length()){
                break;
            }
        }

        System.out.println(Integer.parseInt(number, 2));
    }
}
