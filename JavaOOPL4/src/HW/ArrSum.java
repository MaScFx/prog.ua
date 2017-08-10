package HW;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by Admin on 10.08.2017.
 */
public class ArrSum {
    public static void main(String[] args) {
        int[] arr = new int[200000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }

        long summ=0;
        Date dateStart = new Date();
        for (int i = 0; i <arr.length ; i++) {
            summ +=arr[i];
        }
        Date dateFinish = new Date();
//        System.out.println(summ);
        long time = dateFinish.getTime()-dateStart.getTime();
        System.out.println("Time - "+time+", Summ = "+summ);

        summ=0;
        ArrSumThread th1=new ArrSumThread(arr,0,100000000);
        ArrSumThread th2=new ArrSumThread(arr,100000000,200000000);
        Date dateThStart= new Date();
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        summ=th1.getSumm()+th2.getSumm();
        Date dateThFinish =new Date();
        time=dateThFinish.getTime()- dateThStart.getTime();
        System.out.println("TimeTh - "+time+", Summ = "+summ);
    }
}
