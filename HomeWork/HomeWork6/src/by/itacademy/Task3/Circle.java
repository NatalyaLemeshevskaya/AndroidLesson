package by.itacademy.Task3;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSqr() {
        return Math.pow(radius,2)*Math.PI;
    }
}
