package by.itacademy.Project.domain;

import by.itacademy.Project.data.entity.Goods;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchByName extends Search {


    @Override
    public void search(ArrayList<Goods> goodsArrayList) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя продукта или часть имени: ");
        String name = scanner.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-Z, ]+");
        Matcher matcher = pattern.matcher(name);

        if (matcher.matches()) {
            /**
             * Товары могут начинаться с одной буквы, чтобы вывести их все,
             * а при неудачном поиске вывести ошибку - вводим счетчик
             */
            int count = 0;

            for (Goods goods : goodsArrayList) {
                if (goods.getName().toLowerCase().contains(name)) {
                    goods.printGoods();
                    count++;
                }

            }
            if(count == 0) {
                System.out.println("Товара с таким именем не найденно ");
            }

        } else {

            System.out.println("Не соотвествует правилам ввода ");
        }


    }
}





