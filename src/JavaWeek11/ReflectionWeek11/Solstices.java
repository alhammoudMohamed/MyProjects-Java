package JavaWeek11.ReflectionWeek11;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Solstices {


    public String getSummerSolsticeCountdown(LocalDate todayDate) {


        LocalDate summerDate = LocalDate.parse("2019-06-21");
        Duration durationBetweenNowAndSummer = Duration.between(summerDate, todayDate);
        return "The Winter Solstice 2019 is on " + summerDate.getDayOfWeek() + ", " + summerDate.getMonth() + summerDate.getDayOfYear() + ", " + summerDate.getYear() + "(in " + durationBetweenNowAndSummer.toDays() + ")";

    }


    public String getWinterSolsticeCountdown(LocalDate todayDate) {

        LocalDate winterDate = LocalDate.parse("2019-12-22");
        Duration durationBetweenNowAndWinter = Duration.between(winterDate, todayDate);
        return "The Winter Solstice 2019 is on " + winterDate.getDayOfWeek() + ", " + winterDate.getMonth() + winterDate.getDayOfYear() + ", " + winterDate.getYear() + "(in " + durationBetweenNowAndWinter.toDays() + ")";
    }

}
