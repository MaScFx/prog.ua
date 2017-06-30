package net.ukr.bior.lession2.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 25.06.2017.
 */
public class Lession1Level2Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter X");
        double userX = sc.nextDouble();
        System.out.println("enter Y");
        double userY = sc.nextDouble();

        double pointAX = 0;
        double pointAY = 0;

        double pointBX = 4;
        double pointBY = 4;

        double pointCX = 6;
        double pointCY = 1;

        double areaTriangle = area(pointAX,pointAY,pointBX,pointBY,pointCX,pointCY);
        double areaTemp1Triangle = area(userX,userY,pointBX,pointBY,pointCX,pointCY);
        double areaTemp2Triangle = area(pointAX,pointAY,userX,userY,pointCX,pointCY);
        double areaTemp3Triangle = area(pointAX,pointAY,pointBX,pointBY,userX,userY);

        if (areaTriangle== (areaTemp1Triangle+areaTemp2Triangle+areaTemp3Triangle)){
            System.out.println("Point is inside triangle");
        } else {
            System.out.println("Point is outside triangle");
        }
    }



    public static double area(double point1X, double point1Y,double point2X,double point2Y,double point3X,double point3Y){
        double area = Math.abs(0.5*((point1X-point3X)*(point2Y-point3Y)-(point2X-point3X)*(point1Y-point3Y)));
        return area;
    }
}
