import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static int sumNumbersInText(final String text) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) sum += Integer.parseInt(matcher.group());
        return sum;
    }

    public static void main(String[] args) {
        final String text = "Jack bought on 5000$, Lucy - 7200$, only Jack on 10$";
        System.out.println(sumNumbersInText(text));
    }
}
