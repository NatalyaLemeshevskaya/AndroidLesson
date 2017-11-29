package by.itacademy.Task1;

public class KitchenAppliances extends DomesticAppliances {


    private double square;
    private double power;

    @Override
    public void turnOn() {
        System.out.println("Включен");

    }

    @Override
    public void turnOff() {
        System.out.println("Выключен");

    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
