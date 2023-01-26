import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat vasya = new Cat(12, "Vasya");
        System.out.println(vasya);

        vasya.setAge(6);
        vasya.setColor(Cat.CatColor.WHITE);
        System.out.println(vasya);

        var mysya = vasya.copyCat();
        System.out.println(mysya);

        System.out.println("Count of aircrafts: " + Airport.getInstance().getAllAircrafts().size());
        System.out.println();

        // m7_2 solution:
        Calendar calendarComparable = Calendar.getInstance();
        calendarComparable.setTime(new Date());
        calendarComparable.add(Calendar.HOUR_OF_DAY, 2);

        Airport.getInstance().getTerminals().stream()
                .map(Terminal::getFlights)
                .forEach(flights -> flights.stream()
                        .filter(flight -> flight.getDate()
                                .before(
                                        calendarComparable.getTime())
                                && flight.getDate().after(new Date())
                        ).forEach(System.out::println));
    }
}
