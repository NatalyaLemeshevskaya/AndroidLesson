package by.itacademy.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String TEXT = "heeeeelloooo fffddrd";

    public static void main(String[] args) {


        Pattern pattern = Pattern.compile("([a-z])\\1+");
        Matcher matcher = pattern.matcher(TEXT);
        StringBuffer stringBuffer = new StringBuffer();

      while(matcher.find()) {
          matcher.appendReplacement(stringBuffer,"$1\\"+String.valueOf(matcher.end()-matcher.start()));
          }
        System.out.println(stringBuffer);

    }
}
