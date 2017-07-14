package net.ukr.bior.Lesson4.HomeWork;

import java.util.Formatter;

/**
 * Created by Administrator on 12.07.2017.
 */
public class L1Lvl1Pi {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            System.out.println(pi(i));
        }

    }
    public static String pi(int num){
        Formatter fr=new Formatter();
        fr.format("%."+num+"f", Math.PI);
        return fr.toString();
    }
}
