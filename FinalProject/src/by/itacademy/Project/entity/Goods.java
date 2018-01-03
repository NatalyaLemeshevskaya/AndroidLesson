package by.itacademy.Project.entity;

import java.util.Date;
import java.util.Objects;

public class Goods {

    private int id;
    private String name;
    private String description;
    private Date year;
    private double price;
    private boolean visible;

    public Goods() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Goods{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + ", year=" + year + ", price=" + price + ", visible=" + visible + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return id == goods.id && Double.compare(goods.price, price) == 0 && visible == goods.visible && Objects.equals(name, goods.name) && Objects.equals(description, goods.description) && Objects.equals(year, goods.year);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, description, year, price, visible);
    }
}

