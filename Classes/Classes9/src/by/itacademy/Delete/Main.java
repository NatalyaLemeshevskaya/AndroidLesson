package by.itacademy.Delete;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Main {

    //сильная ссылка(не дают удалять обьект)
    private Student student = new Student();
    //слабая ссылка(объект не будет удаляться, но пока есть память, как только она заканчивается то сборщик мусора удаляет)
    private SoftReference<Student> studentSoftReference = new SoftReference<Student>(new Student());
    //мягкая ссылка(удаляется когда не осталось сильных ссылок)
    private WeakReference<Student> studentWeakReference = new WeakReference<Student>(student);
    //фантомная ссылка(сама почитай)


    public void main(String[] args) {

        Student student = studentSoftReference.get();
        //типы данных
        //по потокам,как запустить,методы потока
        //наследования,protected(типы данных),overide
        //ключевые слова
        //исключения,коллекции(что можно делать,что нельзя,реальзация)
        //switch чем отлич jdr b jdk
        //StringBuffer StringBuilder
        //перегрузака,переопределение
        //чем отли абст класс от интерфейса
        //типизация класс(дан класс,написать какие образом создать класс)
        //comprator ...
        //-127 +128 Integer == ссылки будут на один и тот же обьект
        //сравнение String(кеширование)!!!!!!!
        //вопрос про искл, посмотреть дойдет ли до final, return в catch ,вызовет ли final
        //Hashcode equals
        //паттерны(Singlton)
        //расширение модификаторов(можно ли поменять тип и в какую сторону если можно)

        //читнуть про рекурсию,сколько можно вызывать






    }
}
