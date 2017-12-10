package by.itacademy.Task2;

import java.util.Scanner;

public class Calculator {
    Scanner in = new Scanner(System.in);


    public  void addition(int number1,int number2){

        int summa = number1+number2;
        System.out.println("Сумма введенных чисел = "+summa);

    }

    public  void subtraction(int number1,int number2){

        System.out.println("Разница введенных чисел = "+(number1-number2));

    }

    public  void multiplication(int number1,int number2)throws TwoException{
        if (number1==2 || number2 ==2){
            throw new TwoException("Наш калькулятор запрещает умножать на 2");
        }

        System.out.println("Произведение введенных чисел = "+(number1*number2));

    }

    public  void division(int number1,int number2){

        System.out.println("Деление первого числа на второе = "+(number1/number2));

    }
    public int vvod1(){
        int number1 = 0;
        System.out.println("Введите целое число 1: ");
        if(in.hasNextInt()) {
            number1 = in.nextInt();
        }else {
            System.out.println("Вы ввели не целое число");
        }
        return number1;
    }
    public int vvod2(){
        int number2 = 0;
        System.out.println("Введите целое число 2: ");
        if(in.hasNextInt()) {
            number2 = in.nextInt();
        }else {
            System.out.println("Вы ввели не целое число");
        }
        return number2;
    }

    public char operator() throws OperatorException{
        System.out.println("Введите оператор: ");
        char operator = in.next().charAt(0);
        if (operator!= '+' || operator!='-'||operator!= '*' ||operator!= '/' ){
            throw new OperatorException("Возможно вы ввели оператор, с которым не работает наш калькулятор");
        }
        return operator;
    }



}
