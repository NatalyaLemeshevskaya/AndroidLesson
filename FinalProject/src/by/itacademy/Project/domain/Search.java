package by.itacademy.Project.domain;

import by.itacademy.Project.data.entity.Goods;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Search {
    public abstract void search(ArrayList<Goods> goodsArrayList) throws IOException;

}
