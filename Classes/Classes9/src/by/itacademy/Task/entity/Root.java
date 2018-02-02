package by.itacademy.Task.entity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Root {

     private String name;
     private List<People> people;

    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Root root = (Root) o;
        return Objects.equals(name, root.name) &&
                Objects.equals(people, root.people);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, people);
    }

    @Override
    public String toString() {
        return "Root{" +
                ", date=" + date +
                " name='" + name + '\'' +
                ", people=" + people +

                '}';
    }
}
