package Lesson;

import java.math.BigInteger;


public class FactorialThread implements Runnable{
    private int number;

    public FactorialThread() {
    }

    public FactorialThread(int number) {
        this.number = number;
    }

    private BigInteger factorial(int n){
        BigInteger fact = new BigInteger("1");
        for (int i=1;i<=n;i+=1){
            fact=fact.multiply(new BigInteger(""+i));
        }
        return fact;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        Thread th= Thread.currentThread();
        for (int i = 0; i < this.number; i++) {
            System.out.println(th.getName()+" "+i+" != " + factorial(i));
        }

    }
}
