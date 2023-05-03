package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DatePractice {

    public static void main(String[] args) {

        // Current Date
        Date currentDate = new Date();


        System.out.println(currentDate);

        int year = 2023-1900; //2023;
        int month = Calendar.APRIL;
        int day = 23;

        // Don't Use
        Date specificDate = new Date(year, month , day);
        System.out.println(specificDate);

        Date miliSecondCurrentDate =  new Date(1683076621023L);
        System.out.println(miliSecondCurrentDate);

        System.out.println(ZoneId.systemDefault());

//        LocalDate , LocalDateTime
        LocalDate currentLocalDate = LocalDate.now(ZoneId.of("Asia/Kathmandu"));

        System.out.println(currentLocalDate);

        LocalDate specificLocaleDate = LocalDate.of(2023, Month.FEBRUARY, 3);
//        LocalDate addedDate = specificLocaleDate.plusDays(90);
//        System.out.println(addedDate);

//        System.out.println(addedDate.getMonth());
//
//        System.out.println(currentLocalDate.isBefore(addedDate));

        System.out.println(specificLocaleDate.lengthOfMonth());


//        2023-05-03 => Wed May 3 2023 // Date Formatting


    }
}
