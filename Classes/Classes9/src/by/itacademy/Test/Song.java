package by.itacademy.Test;

import java.util.Date;

public class Song {

    private String name;
    private String path;
    private long size;
    private Date datetime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Song{" + "name='" + name + '\'' + ", path='" + path + '\'' + ", size=" + size + ", datetime=" + datetime + '}';
    }
}
