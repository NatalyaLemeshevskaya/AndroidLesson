package by.itacademy.Project.domain;

import by.itacademy.Project.data.entity.Goods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchById extends Search {
    @Override
    public void search(ArrayList<Goods> goodsArrayList) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("id ");
        int id = scanner.nextByte();
        for(Goods goods : goodsArrayList){
            if(goods.getId() == id){
                goods.printGoods();
            }else {
                System.out.println("no");
            }

        }



    }
}
