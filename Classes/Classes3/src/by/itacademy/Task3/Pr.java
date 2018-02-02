package by.itacademy.Task3;

public class Pr extends Fig{
    private double a;
    private double b;

    public Pr(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSqr() {
        return a*b;
    }
}
