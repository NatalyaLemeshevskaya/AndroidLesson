package by.itacademy.Project.domain;

import by.itacademy.Project.data.entity.Goods;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;


//Абстрактный родительский класс для поиска
public abstract class Search {
    public abstract void search(ArrayList<Goods> goodsArrayList) throws IOException;

}
