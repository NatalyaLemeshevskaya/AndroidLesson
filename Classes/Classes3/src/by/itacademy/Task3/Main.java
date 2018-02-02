package by.itacademy.Task3;

public class Main {
    public static void main(String[] args) {

        Fig fig = null;
        int input=2;
        switch (input){
            case 1:{
                fig = new tr(10,20);
                break;

            }
            case 2:{
                fig = new Pr(15,6);
                break;
            }
            case 3:{
                fig = new Q(5);
                break;
            }
            default:
                System.out.println("нет");

        }
        printFig(fig);
    }
    private static void printFig(Fig fig){
        System.out.println("площадь фигуры="+ fig.getSqr());
// проверка к какому типу относитс обьект , но не очень
        if (fig instanceof Fig){
            System.out.println("фигура");
        }

        if (fig instanceof tr){
            System.out.println("треугольник");
        }
        if (fig instanceof Q){
            System.out.println("квадрат");
        }
        if (fig instanceof Pr){
            System.out.println("прямоугольник");
        }
    }
}
