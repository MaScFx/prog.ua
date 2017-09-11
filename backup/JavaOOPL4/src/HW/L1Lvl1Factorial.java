package HW;

import java.math.BigInteger;

public class L1Lvl1Factorial {
    public static void main(String[] args) {
        Thread[] threadsArr = new Thread[100];
        for (int i = 0; i <threadsArr.length ; i++) {
            threadsArr[i]= new Thread(new FactorialTh(i));
        }

        for (int i = 0; i <threadsArr.length ; i++) {
            threadsArr[i].start();
        }
    }
}
