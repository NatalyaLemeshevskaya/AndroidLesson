package by.itacademy.Task3;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getSqr() {
        return a*a;
    }
}
