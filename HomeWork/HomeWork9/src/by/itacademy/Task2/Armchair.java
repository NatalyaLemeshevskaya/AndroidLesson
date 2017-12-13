package by.itacademy.Task2;

public class Armchair extends Furniture {
    private String nameOfArmchair;

    public Armchair(double sq, String nameOfArmchair) {
        super(sq);
        this.nameOfArmchair = nameOfArmchair;
    }

    public String getNameOfArmchair() {
        return nameOfArmchair;
    }

    public void setNameOfArmchair(String nameOfArmchair) {
        this.nameOfArmchair = nameOfArmchair;
    }
}
