package Lesson;

/**
 * Created by Admin on 05.08.2017.
 */
public class Ac {
    private boolean turn;

    public Ac(boolean turn) {
        this.turn = turn;
    }

    public synchronized void setText(String text, boolean turn){
        while (this.turn==turn){
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.print(text+" ");
        this.turn=!this.turn;
        notifyAll();
    }
}
