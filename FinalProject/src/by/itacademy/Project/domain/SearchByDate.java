package by.itacademy.Project.domain;

import by.itacademy.Project.domain.entity.Goods;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Класс для поиска товара по дате изготовления
 * для удобства реализуем паттерн Adapter
 */

public class SearchByDate extends Search {


    @Override
    public void search(ArrayList<Goods> goodsArrayList) throws IOException {

        Adapter adapter = new Adapter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате xxxx-xx-xx : ");
        String dateStr = scanner.nextLine();
        Date date = null;
        try {
            date = adapter.adapter(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        for(Goods goods : goodsArrayList){

           if(goods.getYear().equals(date)){
               goods.printGoods();
           }

        }


    }
}