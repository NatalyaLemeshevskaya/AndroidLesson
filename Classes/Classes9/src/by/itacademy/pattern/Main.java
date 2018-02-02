package by.itacademy.pattern;

public class Main {
    public static void main(String[] args) {

        Manager manager = Manager.getInstance();
        manager.setA("GGGGGG");

        Manager manager1 = Manager.getInstance();
        System.out.println(manager1.getA());

    }
}
