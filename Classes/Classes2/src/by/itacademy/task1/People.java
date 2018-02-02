package by.itacademy.task1;

public class People {

    public static int staticValue;

    // тип по умочанию,пустой, доступен ко всем классам внутри пакета. default
    private String name;
    private int age;
// для первого
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
        //для второго
        //будет выполнем при вызове People
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
