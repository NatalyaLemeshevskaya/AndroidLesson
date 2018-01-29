package by.itacademy.project.domain.search;

import by.itacademy.project.domain.entity.Goods;

import java.io.IOException;
import java.util.ArrayList;


//Абстрактный родительский класс для поиска
public abstract class Search {
    public abstract void search(ArrayList<Goods> goodsArrayList) throws IOException;

}
