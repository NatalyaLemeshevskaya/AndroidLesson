package by.itacademy.Task2;

public class Table extends Furniture {

    private String nameOfTable;


    public Table(double sq, String nameOfTable) {
        super(sq);
        this.nameOfTable = nameOfTable;
    }

    public String getNameOfTable() {
        return nameOfTable;
    }

    public void setNameOfTable(String nameOfTable) {
        this.nameOfTable = nameOfTable;
    }

}
