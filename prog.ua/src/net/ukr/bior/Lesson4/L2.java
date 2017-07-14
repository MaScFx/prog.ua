package net.ukr.bior.Lesson4;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 * Created by Igor on 08.07.2017.
 */
public class L2 {
    public static void main(String[] args) {
        Calendar cl =Calendar.getInstance();
        System.out.println(cl.get(Calendar.MONTH));
        cl.set(Calendar.YEAR, 1981);
        cl.set(Calendar.MONTH, Calendar.OCTOBER);
        cl.set(Calendar.DAY_OF_MONTH, 11);
        Date data = cl.getTime();
        StringBuffer sb=new StringBuffer();
        Formatter fr = new Formatter();
    }
}
