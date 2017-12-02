package by.itacademy.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Shape shape = null;
        System.out.println("Введите 1, если хотите узнать площадь треуголька, 2 - если прямоульника, 3 - если квадрата и 4 - если круга");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        switch (input){
            case 1:{
                shape = new Triangle(10,20);
                break;

            }
            case 2:{
                shape = new Rectangle(15,6);
                break;
            }
            case 3:{
                shape = new Square(5);
                break;
            }
            case 4:{
                shape = new Circle(14);
                break;

            }
            default:
                System.out.println("нет");

        }
        printFig(shape);
    }
    private static void printFig(Shape shape){
        System.out.println("Площадь фигуры="+ shape.getSqr());
// проверка к какому типу относитс обьект , но не очень
        if (shape instanceof Shape){
            System.out.print("Фигура ");
        }

        if (shape instanceof Triangle){
            System.out.println("треугольник");
        }
        if (shape instanceof Square){
            System.out.println("квадрат");
        }
        if (shape instanceof Rectangle){
            System.out.println("прямоугольник");
        }
        if (shape instanceof Circle){
            System.out.println("круг");
        }
    }
}
