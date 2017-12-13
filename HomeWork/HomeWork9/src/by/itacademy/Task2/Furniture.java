package by.itacademy.Task2;
//потом лучше сделать еще интерфейс или абст метод всей мебели и от нее всякая мебедь
public class Furniture {
    //площадь
    private double sq;

    public Furniture(double sq) {
        this.sq = sq;
    }

    public double getSq() {
        return sq;
    }

    public void setSq(double sq) {
        this.sq = sq;
    }
}
