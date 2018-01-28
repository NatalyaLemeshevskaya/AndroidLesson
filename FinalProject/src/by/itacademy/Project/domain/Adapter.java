package by.itacademy.Project.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс, для осуществления  паттерна Adapter
 * Получилось очень удобно скрыть перевод из строки
 */
public class Adapter {

    public Date adapter(String dateStr) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        date = sdf.parse(dateStr);

        return date;
    }
}
