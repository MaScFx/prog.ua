package net.ukr.bior.lession2.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 25.06.2017.
 */
public class Lession1Level1House {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double numberAppartment; //double необходим для строки 23 и 26
        while (true) {
            System.out.println("Input number of Appartment");
             numberAppartment = sc.nextInt();
            if (numberAppartment>=1&&numberAppartment<=144){
                break;
            } else {
                System.out.println("FATAL ERROR, PLEASE TRY AGAIN");
                System.out.println();
            }
        }

        int porch = (int)Math.ceil(numberAppartment/36);
        int floor;
        if (numberAppartment%36!=0){
            floor = (int)Math.ceil((numberAppartment%36)/4);
        }   else {
            floor=9;
        }

        System.out.println("This appartment is in "+porch+" porch on "+floor+" floor!");



    }
}
