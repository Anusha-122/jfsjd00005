package java8features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class datetime {
    public static void main(String[] args) {
//        LocalTime t=LocalTime.now();
//        System.out.println(t);
//        LocalDate d=LocalDate.now();
//        System.out.println(d);
//        LocalDate y=LocalDate.of(2004,Month.SEPTEMBER,26);
//        System.out.println(y);
        LocalTime e = LocalTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(e);
        int count = 0;
        for (String s : ZoneId.getAvailableZoneIds()) {
            //System.out.println(s);
            count++;
        }
        System.out.println("Total Zone Id are: " + count);
        for (String s : ZoneId.getAvailableZoneIds())
        {
            System.out.println("zone ids are: "+(s));

        }
    }
}


