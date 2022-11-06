package Advanced;

import java.time.*;

public class DateAndTimeExamples {
    public static void main(String[] args) {
        //LocalTime
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("Now is: " + localTime);
        System.out.println(localTime.getHour() + "/" + localTime.getMinute() + "/" + localTime.getSecond());
        System.out.printf("%d/%d/%d\n", localTime.getHour(), localTime.getMinute(), localTime.getSecond());

        LocalTime localTime1 = LocalTime.now().withNano(0).withSecond(0);
        System.out.println(localTime1);
        //increase localtime1 by 15 minutes
        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Breake until: " + localTime1);

        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is " + localDate);
        System.out.println("Year is " + localDate.getYear());
        System.out.println("Day of the week: " + localDate.getDayOfWeek());
        System.out.println("Day of the year: " + localDate.getDayOfYear());
        System.out.println("Week of the year: " + (localDate.getDayOfYear()/7+1));

        LocalDate localDate1 = LocalDate.of(2019, Month.DECEMBER, 11);
        System.out.println("Covid first case date was: " + localDate1);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and time now is " + localDateTime.withNano(0));

        LocalDateTime firstInternationalCatsDay = LocalDateTime.of(1997, 11, 20,10,45,25,0);
        System.out.println("First International Cat's Day took place in " + firstInternationalCatsDay);
        System.out.println(firstInternationalCatsDay.getMonth().getValue() + "." + firstInternationalCatsDay.getDayOfMonth());
        System.out.println(firstInternationalCatsDay.getMonth() + " " + firstInternationalCatsDay.getDayOfMonth());


        //Duration
        System.out.println(Duration.ofHours(11).toMinutes());
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes());
        System.out.println(Duration.between(firstInternationalCatsDay, LocalDateTime.now()).toDays()/365);

        //Period
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(160)).getMonths());
    }
}
