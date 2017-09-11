package net.ukr.bior.Lesson2.Lesson;

/**
 * Created by Admin on 22.07.2017.
 */
public class Ball implements Play{
    private String color;
    private int size;

    public Ball() {
    }

    public Ball(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public String playWith() {
        return this.toString()+ "Baz-Baz_baz";
    }
}
