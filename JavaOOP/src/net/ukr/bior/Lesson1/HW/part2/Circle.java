package net.ukr.bior.Lesson1.HW.part2;

public class Circle extends Shape{
    private Point a;
    private double radius;

    @Override
    double getPerimetr() {
        return 2*Math.PI*radius;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }



    public Circle() {
    }

    public Circle(Point a, double radius) {
        this.a = a;
        this.radius = radius;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
