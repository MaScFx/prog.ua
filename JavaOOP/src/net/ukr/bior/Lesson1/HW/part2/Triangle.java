package net.ukr.bior.Lesson1.HW.part2;

public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    @Override
    double getPerimetr() {
        return lengthBetweenPoints(a, b) + lengthBetweenPoints(b, c) + lengthBetweenPoints(a, c);
    }

    @Override
    double getArea() {
        return Math.abs(0.5 * ((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY())));

    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double lengthBetweenPoints(Point a, Point b) {
        return  Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public Triangle() {
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


}
