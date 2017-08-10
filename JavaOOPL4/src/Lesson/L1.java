package Lesson;

/**
 * Created by Admin on 05.08.2017.
 */
public  class L1 implements Runnable {
    private String text;
    private Ac ac;
    private boolean turn;



    public L1(String text, Ac ac, boolean turn) {
        this.text = text;
        this.ac = ac;
        this.turn = turn;
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            ac.setText(text,turn);
        }

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

//push turn  5 раз вывести на экран