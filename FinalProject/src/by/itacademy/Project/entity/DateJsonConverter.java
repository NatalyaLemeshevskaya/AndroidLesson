package by.itacademy.Project.entity;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.util.Date;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public class DateJsonConverter implements JsonDeserializer<Date> {
    private final String[] formats = new String[]{
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
