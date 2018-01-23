package by.itacademy.Project.presentation;

import by.itacademy.Project.data.*;
import by.itacademy.Project.data.entity.Goods;
import by.itacademy.Project.data.entity.Root;
import by.itacademy.Project.domain.*;

import java.io.IOException;
import java.util.Scanner;

/**
 * Управляющий класс
 */
public class Manager {
   /**
    *  Реализация Singleton
    */
    private static Manager instance = new Manager();

    public static Manager getInstance() {
        return instance;
    }

    private Manager() {
    }

    //Константы парсеров
    private final String fileXml = "goods.xml";
    private final String fileJson = "goods.json";
    //Переменная хранит  распарсенные данные
    Root root ;
    Scanner scanner = new Scanner(System.in);;
    //Переменная цифры, кот. мы будет вводить с клавиатуры для выбора определенной функции
    int number;

    //Метод старта проекта
    public void startProject() throws IOException {

        System.out.println("Добро пожаловать в магазин! ");
        System.out.println("Для начала скачаем файлы с информацией о магазине");


        //Скачиваем файлы, реализуя многопоточность

        DownLoaderMultithreading downLoaderMultithreading = new DownLoaderMultithreading();
        downLoaderMultithreading.download();

        System.out.println("Делее распарсим данные ");
        System.out.println("Введите 1 - если хотите скачать и распарсить XML, 2 - если JSON:");
        check(scanner);
        number = scanner.nextInt();
        switch (number) {
            case 1:
                Parser parserXml = new XMLParser();
                root = parserXml.parse(fileXml);
                break;
            case 2:
                Parser parserJson = new JSONParser();
                root = parserJson.parse(fileJson);
                break;
            default:
                System.out.println("Вы явно промазали ");
                return;
             }

        System.out.println("Отлично, похоже можно работать с товарами ");
        System.out.println("-----------------------------------------");
        System.out.println("Вот что вы можете сделать с товарами:");

        //Чтобы пользователь мог неоднократно изпользовать предоставляемые ему функции,
        // удобно изпользовать бесконечный цикл While
        while (true) {
            System.out.println("Введите :\n1 - если хотите получить информацию о магазине\n" +
                    "2 - если хотите вывести все товары и информацию о них \n" +
                    "3 - если хотите найти определенный товар\n" +
                    "4 - если хотите отсортировать товары\n" +
                    "0 - если хотите выйти");
            check(scanner);
            number = scanner.nextInt();

            switch (number) {
                case 1:
                    root.print();
                    break;
                case 2:
                    for (Goods goods : root.getGoods()) {
                        goods.printGoods();
                    }
                    break;
                case 3:
                    System.out.println("Введите :\n1 - если хотите найти товар по имени\n" +
                            "2 - по номеру товара\n" +
                            "3 - по диапозону цен");
                    check(scanner);
                    number = scanner.nextInt();
                    switch (number) {

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
                    System.out.println("Введи :\n1 - если хотите отсортировать товары по имени\n" +
                            "2 - если по цене ");
                    check(scanner);
                    number = scanner.nextInt();
                    switch (number) {
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
                    return;

                default:{
                    System.out.println("Вы явно промазали ");
                }

            }

        }
    }

    /**
     * Метод для проверки введенных с клавиатуры данных
     * В данном варианте проверяет на int и при ошибке выводит сообщение
     */
    public static void check(Scanner scanner){

        while (!scanner.hasNextInt()){
            System.out.println("Ошибочка, попробуйте еще раз ");
            scanner.next();
        }

    }

}
