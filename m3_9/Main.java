import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    private static void printDatesBirthdayInDays() {
        Calendar calendar = new GregorianCalendar(2007, Calendar.MARCH, 12);

        for(int i = 0; i < 16; ++i) {
            System.out.println(i + 1 + ". " + calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, new Locale("ru")));
            calendar.roll(Calendar.YEAR, 1);
        }
    }

    public static void main(String[] args) {
        printDatesBirthdayInDays();
    }
}
