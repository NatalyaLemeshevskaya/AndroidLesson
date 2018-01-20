package by.itacademy.Project.presentation;



import by.itacademy.Project.domain.Manager;


import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException {


        Manager manager = Manager.getInstance();
        manager.startProject();


//        Root root;
//
//        Parser parser = new XMLParser();
//        root = parser.parse("goods.xml");
//
//
////
////        Search search = new SearchByName();
////        search.search(root.getGoods());
//
////        Search search1 = new SearchById();
////        search1.search(root.getGoods());
//
////        Search search1 = new SearchByPrice();
////        search1.search(root.getGoods());
//
//        SortByName sortByName = new SortByName();
//        sortByName.sort(root);
//
//        SortByPrice sortByPrice = new SortByPrice();
//        sortByPrice.sort(root);
//


    }
}
