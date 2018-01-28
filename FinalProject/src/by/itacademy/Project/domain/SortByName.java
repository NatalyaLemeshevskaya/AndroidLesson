package by.itacademy.Project.domain;

import by.itacademy.Project.domain.entity.Goods;
import by.itacademy.Project.domain.entity.Root;

import java.util.Comparator;

/**
 * Класс для сортировки по имени
 * Переопределяем метод интерфейса Comparator для правильной сортировки
 */
public class SortByName implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {

        String str1 = o1.getName();
        String str2 = o2.getName();
        return str1.compareTo(str2);

    }

    public void sort(Root root){
        root.getGoods().sort(new SortByName());
        System.out.println(root.getGoods().toString());

    }
}
