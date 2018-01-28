package by.itacademy.Project.data.Parser;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.util.Date;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Чтобы разспарсить дату из JSON файла соездаем отдельный класс
 */
public class DateJsonConverter implements JsonDeserializer<Date> {
    private final String[] formats = new String[]{
            //Возможные записи дат в файле(на случай, если мы не знаем в каком именно формате записана дата)
            "yyyy-MM-dd HH:mm",
            "yyyy-MM-dd"

    };
    @Override
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        for(String format : formats){
            try{
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.getDefault());
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GTM"));
                return simpleDateFormat.parse(jsonElement.getAsString());
            }catch (Exception e){

            }
        }


        return null;
    }
}
