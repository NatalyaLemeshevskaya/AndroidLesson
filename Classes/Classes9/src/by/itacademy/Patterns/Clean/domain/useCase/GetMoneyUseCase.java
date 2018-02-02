package by.itacademy.Patterns.Clean.domain.useCase;

import by.itacademy.Patterns.Clean.domain.entity.GetMoneyResult;
import by.itacademy.Patterns.Clean.domain.entity.Money;
import by.itacademy.Patterns.Clean.domain.repository.MoneyRepository;

public class GetMoneyUseCase implements UseCase {

    private MoneyRepository moneyRepository;

    public GetMoneyUseCase(MoneyRepository moneyRepository){
        this.moneyRepository = moneyRepository;

    }
    //у useCase должен быть только один публичный метод!
    //не считая конструктор,конечно
    //посмотреть баланс,если хватает денег,то снять
    public void execute(Money money,GetMoneyListener resultListener){
        //получаем тукущее количество денег
        Money currentMoney = moneyRepository.get();
        //проверяем достаточно ли денег
       if(currentMoney.getMoney() >= money.getMoney()){

            Money newMoney = new Money();
            newMoney.setMoney(currentMoney.getMoney() - money.getMoney());

            //сохраняем новое количество денег
            moneyRepository.save(newMoney);

            //возращаем результат в presentation слой
            GetMoneyResult result = new GetMoneyResult();
            resultListener.onResult(result);

       }else {
           //возращаем ошибку в presentation слой
            resultListener.onError();
       }



    }
     public interface GetMoneyListener{
        void onResult(GetMoneyResult getMoneyResult);
        void onError();
    }

}
