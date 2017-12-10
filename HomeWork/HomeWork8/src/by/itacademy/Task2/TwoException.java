package by.itacademy.Task2;

public class TwoException extends Exception {

    private String russionMessage;

    public TwoException(String russionMessage) {
        this.russionMessage = russionMessage;
    }

    public String getRussionMessage() {
        return russionMessage;
    }
}
