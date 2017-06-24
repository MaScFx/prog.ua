package net.ukr.bior.lession1;

import java.util.Scanner;

/**
 * Created by Administrator on 18.06.2017.
 */
public class Lession01Circle
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите радиус круга");
        Double radius = sc.nextDouble();

        Double length= 2*Math.PI*radius;
        System.out.println("Длинна окружности равна = "+length);

    }
}
