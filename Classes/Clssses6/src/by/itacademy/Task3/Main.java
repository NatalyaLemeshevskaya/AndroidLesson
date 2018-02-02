package by.itacademy.Task3;

public class Main {
    public static void main(String[] args) {
//создаем нужные элементы
        UI ui = new UI();// допустим в UI лежит логика работы с пользователем
        Button button = new Button();//создали кнопку
        button.setButtonClick(ui);//скинули ссылка на UI в Button


        //если мы хотим ту же кнопку но чтобы сообщение о клике приходило в другой обьект
        UI2 ui2 = new UI2();
        Button button2 = new Button();
        button2.setButtonClick(ui2);


         try {
             Thread.sleep(3000);
         }catch (InterruptedException e){}

         //симулируем нажатие на кнопку. в реальности этого тут не будет

        button.emulateClickOnButton();
        button2.emulateClickOnButton();

    }

}
