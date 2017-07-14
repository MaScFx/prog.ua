package net.ukr.bior.Lesson4;

import java.util.Formatter;

/**
 * Created by Igor on 08.07.2017.
 */
public class L3 {
    public static void main(String[] args) {
        Formatter fr= new Formatter();
        System.out.println(stringFromDouble(Math.PI, 4));
    }

    public static String stringFromDouble(double number, int n){
        String text= String.format("%."+n+"f", number);
        return text;


    }
}
