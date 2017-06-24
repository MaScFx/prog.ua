package net.ukr.bior.lession1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lession01FiveNumber
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Long value;
        while (true){
            System.out.println("Введите пятизначное число");
            value = Long.parseLong(reader.readLine());
            if (String.valueOf(Math.abs(value)).length()==5)
                break;

        }

        System.out.println(value/10000);
        System.out.println(value%10000/1000);
        System.out.println(value%1000/100);
        System.out.println(value%100/10);
        System.out.println(value%10);
    }
}
