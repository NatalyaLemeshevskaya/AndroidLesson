package by.itacademy.Task2;
//для классса  final запрещает наследование
public abstract class People {
    //неизменяемая переменная
    private final String CONST="dfsdfj";

    private String name;
    private int age;
    private String address;
    private String pasportNumber;
// метода final  нельзя переопределить
    public  String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPasportNumber() {
        return pasportNumber;
    }

    public void setPasportNumber(String pasportNumber) {
        this.pasportNumber = pasportNumber;
    }
}
