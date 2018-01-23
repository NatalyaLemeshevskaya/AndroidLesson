package by.itacademy.Project.domain;

import by.itacademy.Project.data.entity.Goods;
import by.itacademy.Project.data.entity.Root;

import java.util.Comparator;

/**
 * Класс для сортировки по цене, удобно изпользовать в такой ситуации
 * интерфейс Comparator. Достаточно правильно переопределить метод
 */

public class SortByPrice implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();

        if (price1 > price2) {
            return 1;
        } else if (price1 < price2) {
            return -1;
        } else {
            return 0;
        }
    }


    public void sort(Root root){
        root.getGoods().sort(new SortByPrice());
        System.out.println(root.getGoods().toString());

    }
}
