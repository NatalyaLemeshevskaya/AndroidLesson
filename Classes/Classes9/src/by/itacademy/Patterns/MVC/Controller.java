package by.itacademy.Patterns.MVC;

import java.util.ArrayList;

public class Controller {

    private View view;

    private ArrayList<Model> data;

    public Controller(View view){
        this.view = view;
    }


    public String getHello(){
        return "Hello";
    }

    public String getDataSortedByName(){
        return data.get(5).getName();
    }

    public int getNumber(){
        view.showMessage("Показать ошибку");
        return 5;
    }



}
