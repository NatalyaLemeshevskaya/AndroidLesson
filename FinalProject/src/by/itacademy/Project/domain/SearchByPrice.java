package by.itacademy.Project.domain;

import by.itacademy.Project.data.entity.Goods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchByPrice extends Search {
    @Override
    public void search(ArrayList<Goods> goodsArrayList) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите min цену ");
        int min = scanner.nextByte();
        System.out.println("Введите max цену ");
        int max = scanner.nextByte();

        boolean find = false;

        for(Goods goods : goodsArrayList){
            if(goods.getPrice()>= min && goods.getPrice()<=max){
                goods.printGoods();
                find = true;
            }

        }if(!find) {
            System.out.println("Не найдено ни одного товара в данном ценновом диапазоне ");
        }else{
            find = !find;
        }


    }
}
