package by.itacademy.Project.domain;

import by.itacademy.Project.data.entity.Goods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * В этом классе осуществляется поиск по номеру товара
 * Класс наследуется от класса Search, переопределяя соответствующий метод
 * Тем самым реализуя полиморфизм
 */
public class SearchById extends Search {
    @Override
    public void search(ArrayList<Goods> goodsArrayList) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер товара:  ");
        /**
         * При работе с клавиатурой необходимо сделать праверку на правильность введенных данный
         * т.к. id может быть только цифрой, делаем проверку
         */
        while (!scanner.hasNextInt()){
            System.out.println("Ошибочка, попробуйте еще раз ");
            scanner.next();
        }
        int id = scanner.nextInt();
        for(Goods goods : goodsArrayList){
            //В файле номера товаров начинаются с 0
            //Для удобства пользователя сделаем номер+1
            if((goods.getId()+1) == id){
                goods.printGoods();
                return;
            }

        }
        System.out.println("Товара с таким номером не найденно ");

    }
}
