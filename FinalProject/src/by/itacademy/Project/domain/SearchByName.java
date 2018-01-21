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
        System.out.println("Введи информацию о каком продукте вы хотели бы получить ");
        String name = scanner.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-Z, ]+");
        Matcher matcher = pattern.matcher(name);

        if (matcher.matches()) {

            for (Goods goods : goodsArrayList) {
                if (goods.getName().contains(name)) {
                    goods.printGoods();
                    return;
                }
            }
            System.out.println("Товара с таким именем не найденно ");


        } else {

            System.out.println("Не соотвествует правилам ввода ");
        }


    }
}





