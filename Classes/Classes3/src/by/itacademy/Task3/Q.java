package by.itacademy.Task3;

public class Q extends Fig {
    private double a;

    public Q(double a) {
        this.a = a;
    }

    @Override
    public double getSqr() {
        return a*a;
    }
}
