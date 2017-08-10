package HW;

/**
 * Created by Admin on 10.08.2017.
 */
public class ArrSumThread extends Thread {
    private int[] arr;
    private int indexStart;
    private int indexFinish;
    private long summ = 0;


    public ArrSumThread(int[] arr, int indexStart, int indexFinish) {
        this.arr = arr;
        this.indexStart = indexStart;
        this.indexFinish = indexFinish;
    }

    public ArrSumThread() {
    }

    @Override
    public void run() {
        for (int i = indexStart; i < indexFinish; i++) {
            summ+=arr[i];
        }
    }

    public long getSumm() {
        return summ;
    }

    public void setSumm(long summ) {
        this.summ = summ;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getIndexStart() {
        return indexStart;
    }

    public void setIndexStart(int indexStart) {
        this.indexStart = indexStart;
    }

    public int getIndexFinish() {
        return indexFinish;
    }

    public void setIndexFinish(int indexFinish) {
        this.indexFinish = indexFinish;
    }
}
