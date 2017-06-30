package net.ukr.bior.lession2.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 29.06.2017.
 */
public class Lession1Level2HappyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticket;
        while (true){
            System.out.println("Enter ticket");
            ticket= sc.nextInt();
            if (ticket/1000>0 && ticket/1000<=9){
                break;
            }
        }
       if (count(ticket)){
           System.out.println("Happy Ticket!!");
       } else {
           System.out.println(":(");
       }
    }

    public static boolean count (int numberOfTicket){
        int one=numberOfTicket/1000;
        int two=numberOfTicket%1000/100;
        int three=numberOfTicket%100/10;
        int four=numberOfTicket%10;

        int tempOne=one+two;
        if (tempOne/10>0){
            tempOne= 1+tempOne%10;
        }

        int tempTwo=three+four;
        if (tempTwo/10>0){
            tempTwo= 1+tempTwo%10;
        }

        if (tempOne==tempTwo){
            return true;
        } else {
            return false;
        }
    }


}
