package JavaWeek11;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exercise1 {
    public static void main(String[] args) {


        LocalDate day = LocalDate.parse("2003-03-13");
        LocalTime time = LocalTime.parse("10:00:00");
        LocalDateTime start = LocalDateTime.of(day, time);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("The day starts at : " + start.format(timeFormatter));
        System.out.println("Magatu wakes up on : " + start.getDayOfWeek().toString().toLowerCase());

        LocalDateTime pickedUpTime = start.plusMinutes(37).plusSeconds(21);

        System.out.println("Magatu is picked up at : " + pickedUpTime.toLocalTime());

        LocalDateTime arriveToAirport = pickedUpTime.plusMinutes(90);
        System.out.println("Magatu arrrives to the airport at : " + arriveToAirport.toLocalTime());

        LocalDateTime flightTime = LocalDateTime.of(2003, 03, 13, 11, 04, 00);
        Boolean isBefore = flightTime.isBefore(arriveToAirport);
        System.out.println("is before : " + isBefore);

        if (isBefore) {
            System.out.println("Magatu missed his flight");
        }


        LocalTime nextFlight = LocalTime.of(18, 45, 00);
        LocalDateTime nextFlightDate = LocalDateTime.of(day, nextFlight);
        Duration duration = Duration.between(arriveToAirport.toLocalTime(), nextFlight);
        System.out.println("Magatu has to wait for : " + duration.toHours() + ":" + duration.minusHours(duration.toHours()).toMinutes());

        LocalDateTime timeInLondon = nextFlightDate.plusMinutes(50).plusHours(11);
        System.out.println("Time in london : " + timeInLondon.toLocalTime());
        ZoneId london = ZoneId.of("Europe/London");

        ZonedDateTime inLondon = timeInLondon.atZone(london);

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime nowInTokyo = inLondon.withZoneSameInstant(tokyo);
        System.out.println("Time and date in Tokyo: " + nowInTokyo);


        ZonedDateTime wakingUp = nowInTokyo.plusHours(11);
        System.out.println("Manager wakes Magatu with a pillow at : " + wakingUp);

        ZonedDateTime advertisementShooting = wakingUp.plusMinutes(47);
        System.out.println("The advertisemsnt shooting starts at : " + advertisementShooting);

        Duration makeUpTime = Duration.ofMinutes(47).minusSeconds(546);


        System.out.println("Magatu prepared himself within : " + makeUpTime.toMinutes());


        ZonedDateTime shootingDone = advertisementShooting.plusHours(7);
        System.out.println("Shooting is done at : " + shootingDone.toLocalTime());

        LocalTime dinnerTime = LocalTime.parse("20:00");
        Duration dinnerOrLunch = Duration.between(dinnerTime, shootingDone);
        if (!dinnerOrLunch.isNegative())
            System.out.println("Magatu has to have Dinner");

        else {
            System.out.println("Magatu has to have Lunch");
        }


        ZonedDateTime timeInTokyo = shootingDone.plusDays(3).plusHours(12).plusHours(11).plusMinutes(50);
        ZonedDateTime londonTime = timeInTokyo.withZoneSameInstant(london);
        System.out.println(timeInTokyo);
        ZonedDateTime TokyoTime = londonTime.withZoneSameInstant(tokyo);
        System.out.println("The date in London is : " + TokyoTime.toLocalDate());


        Duration fansTime = Duration.ofSeconds(173 * 12);
        System.out.println("It took him : " + fansTime.toHours() + ":" + fansTime.minusHours(fansTime.toHours()).toMinutes() + " to dispatch his fans");


        ZonedDateTime arriveAtHotel = londonTime.plus(fansTime).plusHours(1);
        System.out.println("Mugatu arrives at the hotel at : " + arriveAtHotel.toLocalTime());


        LocalDate localDate = arriveAtHotel.toLocalDate();

        if (localDate.getDayOfWeek().equals("Thursday") | localDate.getDayOfWeek().equals("Friday"))
            System.out.println("Magatu can get a special massage");


        else if (localDate.isLeapYear() && arriveAtHotel.getDayOfWeek().equals("Saturday")) {
            System.out.println("Magatu can get a special massage");
        } else System.out.println("Magatu cannot have the special massage");


        ZonedDateTime tokyoAdvertisement = arriveAtHotel.plusDays(7);
        LocalTime advertisementTime = LocalTime.parse("18:30");
        ZonedDateTime nowInTokyoo = tokyoAdvertisement.withZoneSameInstant(tokyo);

        System.out.println(nowInTokyoo);


    }


}
