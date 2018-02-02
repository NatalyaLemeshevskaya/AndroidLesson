package by.itacademy.Task1;

import java.util.Objects;

public class Student implements Comparable<Student> {


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

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


// мы переопределили метод
//    @Override
//    public boolean equals(Object obj) {
//
//        Student student = (Student) obj;
//
//        return this.name.equals(student.getName());
//    }

    @Override
    public String toString() {
        return "Student (" +
                "name= "+ name+" age= "+age+")";
    }

    @Override
    public int compareTo(Student o) {

        if (this.age == o.age
                && this.name.compareTo(o.getName())==0) {
            return 0;
        }
        if (this.age > o.age) return 1;

        return -1;

      //  return this.name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
