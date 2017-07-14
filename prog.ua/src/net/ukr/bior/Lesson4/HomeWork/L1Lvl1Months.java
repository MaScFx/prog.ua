package net.ukr.bior.Lesson4.HomeWork;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 11.07.2017.
 */
public class L1Lvl1Months {
    public static void main(String[] args) {
        Calendar cl =Calendar.getInstance();
        Date timeToday = cl.getTime();
        cl.set(Calendar.MONTH, cl.get(Calendar.MONTH)-1);
        Date timeMonthAgo = cl.getTime();
        Long time = timeToday.getTime()-timeMonthAgo.getTime();
        System.out.println(time);
    }
}
