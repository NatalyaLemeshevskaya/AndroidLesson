package by.itacademy.Task19;

public class  MyCollection<T extends Number,R extends String> {

    private T value;
    private R value2;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public R getValue2() {
        return value2;
    }

    public void setValue2(R value2) {
        this.value2 = value2;
    }
}
