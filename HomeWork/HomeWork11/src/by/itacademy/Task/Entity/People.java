package by.itacademy.Task.Entity;

import java.util.Objects;

public class People {

    private int id;
    private String name;
    private String surname;
    private int age;
    private boolean isDegree;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDegree() {
        return isDegree;
    }

    public void setDegree(boolean degree) {
        isDegree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "People{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", age=" + age + ", isDegree=" + isDegree + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id == people.id &&
                age == people.age &&
                isDegree == people.isDegree &&
                Objects.equals(name, people.name) &&
                Objects.equals(surname, people.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, surname, age, isDegree);
    }
}
