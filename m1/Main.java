import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar rusCalendar = new GregorianCalendar();
        System.out.println(rusCalendar.get(Calendar.HOUR) + ":" + rusCalendar.get(Calendar.MINUTE) + " " + rusCalendar.get(Calendar.DAY_OF_MONTH) + "/" + rusCalendar.get(Calendar.MONTH) + "/" + rusCalendar.get(Calendar.YEAR));

        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm dd/MM/yy");
        Date currentDate = new Date();
        System.out.println(formatter.format(currentDate));
    }
}
