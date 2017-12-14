package by.itacademy.Task2;
//потом лучше сделать еще интерфейс или абст метод всей мебели и от нее всякая мебедь
public abstract class Furniture {
    //площадь
    private double sq;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Furniture(double sq, String name) {
        this.sq = sq;
        this.name = name;
    }

    public double getSq() {
        return sq;
    }

    public void setSq(double sq) {
        this.sq = sq;
    }
}
