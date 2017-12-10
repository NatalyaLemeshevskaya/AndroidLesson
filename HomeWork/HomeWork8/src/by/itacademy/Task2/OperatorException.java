package by.itacademy.Task2;

public class OperatorException extends Exception {

    private String russionMessage;

    public String getRussionMessage() {
        return russionMessage;
    }

    public OperatorException(String russionMessage) {
        this.russionMessage = russionMessage;
    }
}
