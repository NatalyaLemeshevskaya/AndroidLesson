package by.itacademy.task;

public class Main {
    public static void main(String[]arg){

        int Spr,Skv;
        double Str;
        Spr= pr(4,5);
        Skv= kv(7);
        Str=tr(4,8);

        System.out.println("Площать квадрата"+ Skv);
        System.out.println("Площать прямоуг"+ Spr);
        System.out.println("Площать треуг "+ Str);


        test(4,5);

    }

    /**
     *
     * @param a- одна сторона прямоугольника
     * @param b- другая сторона прямоугольника
     * @return
     */
    public static int pr(int a, int b){
        return a*b;
    }
/**
@param st- сторона квадрата
 */
    public static int kv(int st){
        return st*st;
    }

    /**
     *
     * @param st1- сторона треугольника
     * @param v- высота
     * @return
     */
    public static double tr(int st1,int v){
        return 0.5*v*st1;

    }
    //задача на дом. почему именно int
    public static void test(long a,long b){
        System.out.println("long");
    }
    public static void test(int a,int b){
        System.out.println("int");
    }
    public static void test(double a,double b){
        System.out.println("double");
    }


}

//разобраться в сортировках
// final- неизменяемая переменная (константа)
// final String b="dsds";