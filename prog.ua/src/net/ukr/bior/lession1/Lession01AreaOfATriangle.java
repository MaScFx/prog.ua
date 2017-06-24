package net.ukr.bior.lession1;

import java.util.Scanner;

/**
 * Created by Administrator on 18.06.2017.
 */
public class Lession01AreaOfATriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону A");
        double sideA=sc.nextDouble();
        System.out.println("Введите сторону B");
        double sideB=sc.nextDouble();
        System.out.println("Введите сторону C");
        double sideC=sc.nextDouble();

        Double p= (sideA+sideB+sideC)/2;
        Double area= Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        System.out.println("Площадь треугольника = "+area);

    }
}
