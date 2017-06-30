package net.ukr.bior.lession2.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 30.06.2017.
 */
public class Lession2Level2figure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=sc.nextInt();
        String string="";
        boolean indicator=true;

        for (int i = 0; i < count*2-1; i++) {
            if (indicator){
                string+="*";
                System.out.println(string);
            }
            if (!indicator||i==count-1){
                indicator=false;
                string=string.substring(0, string.length()-1);
                System.out.println(string);
            }
        }

    }
}
