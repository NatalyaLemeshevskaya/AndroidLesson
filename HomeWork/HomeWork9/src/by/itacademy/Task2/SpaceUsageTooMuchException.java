package by.itacademy.Task2;

public class SpaceUsageTooMuchException extends Exception  {

    private String russionMessage;

    public SpaceUsageTooMuchException(String russionMessage) {
        this.russionMessage = russionMessage;
    }

    public String getRussionMessage() {
        return russionMessage;
    }
}
