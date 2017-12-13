package by.itacademy.Task2;

public class Sofa extends Furniture {

    private String nameOfSofa;

    public Sofa(double sq, String nameOfSofa) {
        super(sq);
        this.nameOfSofa = nameOfSofa;
    }

    public String getNameOfSofa() {
        return nameOfSofa;
    }

    public void setNameOfSofa(String nameOfSofa) {
        this.nameOfSofa = nameOfSofa;
    }
}
