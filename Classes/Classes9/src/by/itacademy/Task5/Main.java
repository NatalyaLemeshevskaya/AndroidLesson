package by.itacademy.Task5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {


    private static AbstractClass abstractClass = new AbstractClass() {
        @Override
        public void test() {

        }
    };


    public static void main(String[] args) {
//       Test test = new Test();
//
//       Class classTest = test.getClass();
//
//     // только название класса classTest.getSimpleName()
//       System.out.println(classTest.getName());
//
//       int mod = classTest.getModifiers();
//
//       if(Modifier.isAbstract(mod)){
//           System.out.println("Abstract");
//       }else {
//           System.out.println("Not abstract");
//       }
//
//        if(Modifier.isPublic(mod)){
//            System.out.println("Public");
//        }else {
//            System.out.println("Not public");
//        }
//
//        //получить поля(переменные)
//        //только публичные поля
//        //  Field[] fields = classTest.getFields();
//        //все поля
//        Field[] fields = classTest.getDeclaredFields();
//
//       for(Field field :fields){
//           System.out.println("field name "+field.getName());
//           //значения
//           try{
//               field.setAccessible(true);
//              // System.out.println("value "+(int)field.get(test));
//
//            //поменять значение
//               field.set(test,50);
//               System.out.println("value "+(int)field.get(test));
//
//           }catch (IllegalAccessException e){
//
//           }
//
//       }
//
//
//        Method[] methods = classTest.getDeclaredMethods();
//       for(Method method: methods){
//         //  method.invoke()
//           System.out.println(method.getName());
//       }

//название у файлом может быть разное,а сами файлы одинаков


        makeSmt(abstractClass);

        makeSmt(new AbstractClass() {
            @Override
            public void test() {

            }
        });

    }
    public static void makeSmt(AbstractClass obj){
        obj.test();
    }

//----------------------------------------------------------

     public  static void main(){
        getMoney1(new OnGetMoneyListenre() {
            @Override
            public void onMoney(int money) {
                //вызовется как только нам отдадут деньги
            }
        });

     }

     //    public static int getMoney(){
//        return 50;
//    }


     public static void getMoney1(OnGetMoneyListenre listenre){
       //проходит время
         //если с банкоматом,50-это количесвто денег которые мы вводим с клавиантуры
        listenre.onMoney(50);
    }
    interface OnGetMoneyListenre{
        void onMoney(int money);
    }

}
