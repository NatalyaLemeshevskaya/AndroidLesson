package by.itacademy.Task3;

public class tr extends Fig {
    private double h;
    private double a;

    public tr(double h, double a) {
        this.h = h;
        this.a = a;
    }

    @Override
    public double getSqr() {
        return 0.5*h*a;
    }
}
