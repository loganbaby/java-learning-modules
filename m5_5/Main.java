import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static HashSet<String> emails = new HashSet<>();

    private static void commandRegister(String command, String line) {
        try {
            if (line.split("\\s").length > 3) throw new Exception("Exception: too much words");
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }

        switch (command) {
            case "add" -> {
                Pattern emailValidation = Pattern.compile("^((([0-9A-Za-z]{1}[-0-9A-z\\.]{0,30}[0-9A-Za-z]?)|([0-9А-Яа-я]{1}[-0-9А-я\\.]{0,30}[0-9А-Яа-я]?))@([-A-Za-z]{1,}\\.){1,}[-A-Za-z]{2,})$");
                Matcher matcherEmailValidation = emailValidation.matcher(line.split("\\s")[1]);
                try {
                    if (!matcherEmailValidation.matches()) throw new Exception("Exception: Non-valid email");
                    emails.add(line.replace("add ", ""));
                } catch (Exception x) {
                    System.out.println(x.getMessage());
                }
            }

            case "list" -> { for (String email : emails) System.out.println(email); }
            case "exit" -> System.exit(1);
            default -> System.out.println("Wrong command!");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String line = in.nextLine();
            commandRegister(line.split("\\s")[0], line);
        }
    }
}
