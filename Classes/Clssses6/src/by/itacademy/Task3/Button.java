package by.itacademy.Task3;

public class Button {
    private ButtonClick buttonClick;
//записываем в Button ссылка на Main чтобы Button мог вызвать методы у Main
    public void setButtonClick(ButtonClick buttonClick) {
        this.buttonClick = buttonClick;
    }
    //симулируем нажатие кнопки, тестовые метод
    public void emulateClickOnButton(){
        if(buttonClick != null) buttonClick.onClick();
    }
}
