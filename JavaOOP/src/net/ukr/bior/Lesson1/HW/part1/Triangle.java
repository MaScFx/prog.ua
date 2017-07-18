package net.ukr.bior.Lesson1.HW.part1;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public double area() {
        if (((sideA+sideB)>sideC)&&((sideA+sideC)>sideB)&&((sideB+sideC)>sideA)){
            double p = (sideA + sideB + sideC) / 2;
            return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        } else {
            return -1;
        }
    }


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
