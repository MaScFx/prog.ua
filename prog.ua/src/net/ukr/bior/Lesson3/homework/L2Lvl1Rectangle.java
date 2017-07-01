package net.ukr.bior.Lesson3.homework;

/**
 * Created by Administrator on 01.07.2017.
 */
public class L2Lvl1Rectangle {
    public static void main(String[] args) {
    }

    public static void  starOfRectangle(int length, int width){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if (i==0 || j==0 || i==width-1 || j==length-1 ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
