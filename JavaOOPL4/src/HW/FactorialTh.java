package HW;

import java.math.BigInteger;

public class FactorialTh implements Runnable{
    private int fCount;

    public FactorialTh(int fCount) {
        this.fCount = fCount;
    }

    @Override
    public void run() {
        System.out.println("Factorial "+fCount+" = "+factorial(fCount));
    }

    public int getfCount() {
        return fCount;
    }

    public void setfCount(int fCount) {
        this.fCount = fCount;
    }

    private static BigInteger factorial(int f) {
        return f <= 1 ? BigInteger.valueOf(1) : factorial(f - 1).multiply(BigInteger.valueOf(f));
    }
}
