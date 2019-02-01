package JavaWeek11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Exercise2 {


    public static void main(String [] args) throws Exception {

        toMilitartyTime();


    }

    private static void toMilitartyTime() throws ParseException {
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a");
        Date date = parseFormat.parse("11:50 Pm");
        System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));
    }
}
