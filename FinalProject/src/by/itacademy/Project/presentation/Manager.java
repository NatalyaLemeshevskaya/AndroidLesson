package by.itacademy.Project.presentation;

import by.itacademy.Project.data.DownLoader;
import by.itacademy.Project.data.JSONParser;
import by.itacademy.Project.data.Parser;
import by.itacademy.Project.data.XMLParser;
import by.itacademy.Project.data.entity.Goods;
import by.itacademy.Project.data.entity.Root;
import by.itacademy.Project.domain.*;

import java.io.IOException;
import java.util.Scanner;

public class Manager {
   /**
    *  Реализация Singlton
    */
    private static Manager instance = new Manager();

    public static Manager getInstance() {
        return instance;
    }

    private Manager() {
    }

    private final String URL_XML ="http://kiparo.ru/t/shop.xml";
    private final String URL_JSON ="http://kiparo.ru/t/shop.json";
    private final String fileXml = "goods.xml";
    private final String fileJson = "goods.json";

    Root root ;
    Scanner scanner;

    public void startProject() throws IOException {

        System.out.println("Добро пожаловать в магазин! ");
        System.out.println("Для начала необходимо скачать файл и распарсить данные ");
        scanner = new Scanner(System.in);
        System.out.println("Введите 1 - если хотите скачать и распарсить XML, 2 - если JSON:");
        int num = scanner.nextByte();

        switch (num) {
            case 1:
                DownLoader downLoaderXml = new DownLoader();
                downLoaderXml.loader(URL_XML);
                Parser parserXml = new XMLParser();
                root = parserXml.parse(fileXml);
                break;
            case 2:
                DownLoader downLoaderJson = new DownLoader();
                downLoaderJson.loader(URL_JSON);
                Parser parserJson = new JSONParser();
                root = parserJson.parse(fileJson);
                break;
            default:
                System.out.println("Вы явно промазали ");
                break;

        }

        System.out.println("Отлично, похоже можно работать с товарами ");
        System.out.println("----------------------------");
        System.out.println("Вот что вы можете сделать с товарами:");
        while (true) {
            System.out.println("Введите :\n1 - если хотите получить информацию о магазине\n" +
                    "2 - если хотите вывести все товары и информацию о них \n" +
                    "3 - если хотите найти определенный товар\n" +
                    "4 - если хотите отсортировать товары\n" +
                    "0 - если хотите выйти");

            int variant = scanner.nextByte();
            switch (variant) {
                case 1:
                    root.print();
                    break;
                case 2:
                    for (Goods goods : root.getGoods()) {
                        goods.printGoods();
                    }
                    break;
                case 3:
                    System.out.println("Введи 1, если хотите найти товар по имени, 2 - по номеру товара, 3 - по диапозону цен ");
                    int option = scanner.nextByte();
                    switch (option) {
                        case 1:
                            Search searchName = new SearchByName();
                            searchName.search(root.getGoods());
                            break;
                        case 2:
                            Search searchId = new SearchById();
                            searchId.search(root.getGoods());
                            break;
                        case 3:
                            Search searchPrice = new SearchByPrice();
                            searchPrice.search(root.getGoods());
                            break;
                        default: {
                            System.out.println("Вы явно промазали ");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Введи 1, если хотите отсортировать товары по имени, 2 - если по цене ");
                    int version = scanner.nextByte();
                    switch (version) {
                        case 1:
                            SortByName sortByName = new SortByName();
                            sortByName.sort(root);
                            break;
                        case 2:
                            SortByPrice sortByPrice = new SortByPrice();
                            sortByPrice.sort(root);
                            break;
                        default: {
                            System.out.println("Вы явно промазали ");
                        }

                    }
                    break;
                case 0:
                    break;
                
            }

        }
    }

}
