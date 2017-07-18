package net.ukr.bior.Lesson1.HW.part2;

/**
 * Created by Igor on 18.07.2017.
 */
public class Square extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;


    @Override
    double getPerimetr() {
        return lengthBetweenPoints(a, b) > lengthBetweenPoints(a, c) ? lengthBetweenPoints(a, c) * 4 : lengthBetweenPoints(a, b) * 4;
    }

    @Override
    double getArea() {
        return Math.pow(a.getX() - b.getX(), 2);
    }

    private double lengthBetweenPoints(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public Square() {

    }

    public Square(Point a, Point b, Point c, Point d) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }


}
