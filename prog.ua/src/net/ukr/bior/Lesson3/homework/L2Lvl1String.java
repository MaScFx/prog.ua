package net.ukr.bior.Lesson3.homework;

/**
 * Created by Administrator on 01.07.2017.
 */
public class L2Lvl1String {
    public static void main(String[] args) {
        System.out.println(stringCoung("azaza asasa ff dd"));
    }
    public static int stringCoung(String text){
        String[] t= text.split(" ");
        return t.length;
    }
}
