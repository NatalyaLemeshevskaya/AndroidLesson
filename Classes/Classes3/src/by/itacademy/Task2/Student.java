package by.itacademy.Task2;

public class Student extends People{

    private String studCardNumber;

    public String getStudCardNumber() {

        return studCardNumber;
    }

    public void setStudCardNumber(String studCardNumber) {

        this.studCardNumber = studCardNumber;
    }

    @Override//нотация (пометки )
    public String getName() {


        return super.getName();
    }
}
