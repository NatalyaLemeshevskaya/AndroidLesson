package by.itacademy.Project.domain;

import by.itacademy.Project.data.entity.Goods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * В этом классе осуществляется поиск по товарам, которые входят в определенный ценовой диапазон
 * Класс наследуется от класса Search, переопределяя соответствующий метод
 */
public class SearchByPrice extends Search {
    @Override
    public void search(ArrayList<Goods> goodsArrayList) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите min цену ");
        while (!scanner.hasNextInt()){
            System.out.println("Ошибочка, попробуйте еще раз ");
            scanner.next();
        }
        int min = scanner.nextInt();
        System.out.println("Введите max цену ");
        while (!scanner.hasNextInt()){
            System.out.println("Ошибочка, попробуйте еще раз ");
            scanner.next();
        }
        int max = scanner.nextInt();
        //Вводим переменную для проверки существования товара в данном ценовом диапазоне
        boolean find = false;

        for(Goods goods : goodsArrayList){
            if(goods.getPrice()>= min && goods.getPrice()<=max){
                goods.printGoods();
                find = true;
            }

        }if(!find) {
            System.out.println("Не найдено ни одного товара в данном ценовом диапазоне ");
        }else{
            find = !find;
        }


    }
}
