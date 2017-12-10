package by.itacademy.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Начнем работу с нашим кальтулятором !");

        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        char operator = ' ';


        number1 =  calculator.vvod1();

        System.out.println("Введите оператор: ");
            operator = in.next().charAt(0);

        number2 =  calculator.vvod2();


        switch (operator){
            case '+':{ calculator.addition(number1,number2);
            break;
            }

            case '-':{ calculator.subtraction(number1,number2);
                break;
            }
            case '*':{ calculator.multiplication(number1,number2);
                break;
            }
            case '/': {calculator.division(number1,number2);
                break;
            }
            default:{
                System.out.println("Вы уверены что ввели правильный оператор?");
            }


        }


    }
}
