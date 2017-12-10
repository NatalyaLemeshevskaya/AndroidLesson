package by.itacademy.Task2;

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

     try {
        operator = calculator.operator();
     }catch (OperatorException e){
         System.out.println(e.getRussionMessage());
     }

        number2 =  calculator.vvod2();


        switch (operator){
            case '+':{ calculator.addition(number1,number2);
            break;
            }

            case '-':{ calculator.subtraction(number1,number2);

                break;
            }
            case '*': {try
                { calculator.multiplication(number1,number2);
                }catch (TwoException e){
            System.out.println(e.getRussionMessage());

        }

                break;
            }
            case '/': {calculator.division(number1,number2);
                break;
            }

        }


    }
}
