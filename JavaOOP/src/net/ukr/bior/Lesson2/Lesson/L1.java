package net.ukr.bior.Lesson2.Lesson;

import java.io.File;

/**
 * Created by Admin on 22.07.2017.
 */
public class L1 {
    public static void main(String[] args) {
        int d = div(5, 1);
        System.out.println(d);
        System.out.println("hell");

        File file = new File("a.txt");
        System.out.println(getFileInfo(file));
        file=null;
//        System.out.println(getFileInfo(file));


    }

    public static int div(int a, int b) {
        int c;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            c = Integer.MAX_VALUE;
            return c;
        } finally {
            c = -1;
        }
        return c;
    }

    public static double getArea(double r) {
        if (r < 0) {
            throw new IllegalArgumentException("Negative radius");
        }
        return Math.PI * r * r;
    }

    public static String getFileInfo (File file){
        if (file==null){
            throw new IllegalArgumentException("Null file pointer");
        }
        return file.getAbsolutePath();
    }

//ДЗ - Композиция 3е задача

}
