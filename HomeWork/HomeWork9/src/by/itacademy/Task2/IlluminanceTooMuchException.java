package by.itacademy.Task2;

public class IlluminanceTooMuchException extends Exception {

    private String russionMessage;

    public IlluminanceTooMuchException(String russionMessage) {
        this.russionMessage = russionMessage;
    }

    public String getRussionMessage() {
        return russionMessage;
    }
}
