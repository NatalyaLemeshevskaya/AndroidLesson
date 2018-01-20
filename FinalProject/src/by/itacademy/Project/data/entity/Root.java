package by.itacademy.Project.data.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Root {

    private String name;
    private String location;
    private List<String> emails;
    private ArrayList<Goods> goods;

    public Root() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public ArrayList<Goods> getGoods() {
        return goods;
    }

    public void setGoods(ArrayList<Goods> goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Root{" + "name='" + name + '\'' + ", location='" + location + '\'' + ", emails=" + emails + ", goods=" + goods + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Root root = (Root) o;
        return Objects.equals(name, root.name) && Objects.equals(location, root.location) && Objects.equals(emails, root.emails) && Objects.equals(goods, root.goods);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, location, emails, goods);
    }
}
