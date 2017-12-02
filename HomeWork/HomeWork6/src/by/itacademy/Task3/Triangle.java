package by.itacademy.Task3;

public class Triangle extends Shape {
    private double h;
    private double a;

    public Triangle(double h, double a) {
        this.h = h;
        this.a = a;
    }

    @Override
    public double getSqr() {
        return 0.5*h*a;
    }
}
