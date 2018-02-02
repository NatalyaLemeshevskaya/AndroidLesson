package by.itacademy.Patterns.Clean.presentation;

import by.itacademy.Patterns.Clean.domain.entity.GetMoneyResult;
import by.itacademy.Patterns.Clean.domain.entity.Money;
import by.itacademy.Patterns.Clean.domain.useCase.GetMoneyUseCase;

import java.util.ArrayList;

public class Controller {

    private View view;

    public Controller(View view){
        this.view = view;
    }

    public void getMoney(){

       //создание потом будем делать
     //   GetMoneyUseCase getMoneyUseCase = new GetMoneyUseCase();

        Money money = new Money();
        money.setMoney(100);

//        getMoneyUseCase.execute(money, new GetMoneyUseCase.GetMoneyListener() {
//            @Override
//            public void onResult(GetMoneyResult getMoneyResult) {
//                view.showGetMoneyResult(true);
//
//            }
//
//            @Override
//            public void onError() {
//                view.showMessage("Деньги не снялись ");
//
//            }
//        });

        //тут стучимся в UseCase , а затем показываем данные на экране
       //  view.showGetMoneyResult();
    }





}
