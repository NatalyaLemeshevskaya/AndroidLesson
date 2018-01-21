package by.itacademy.Project.domain;

import by.itacademy.Project.data.entity.Goods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchById extends Search {
    @Override
    public void search(ArrayList<Goods> goodsArrayList) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер товара:  ");
        int id = scanner.nextByte();
        for(Goods goods : goodsArrayList){
            if((goods.getId()+1) == id){
                goods.printGoods();
                return;
            }

        }
        System.out.println("Товара с таким номером не найденно ");

    }
}
