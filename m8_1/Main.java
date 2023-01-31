import java.util.Scanner;

public class Main {
    private static final String addCommand = "add Василий Петров " +
            "vasily.petrov@gmail.com +79215637722";
    private static final String commandExamples = "\t" + addCommand + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static final String commandError = "Wrong command! Available command examples: \n" +
            commandExamples;
    private static final String helpText = "Command examples:\n" + commandExamples;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();

        while (true) {
            String command = scanner.nextLine();
            String[] tokens = command.split("\\s+", 2);

            try {
                switch (tokens[0]) {
                    case "add" -> executor.addCustomer(tokens[1]);
                    case "list" -> executor.listCustomers();
                    case "remove" -> executor.removeCustomer(tokens[1]);
                    case "count" -> System.out.println("There are " + executor.getCount() + " customers");
                    case "help" -> System.out.println(helpText);
                    default -> throw new IllegalArgumentException(command);
                }
            } catch(IllegalArgumentException x) {
                x.printStackTrace();
            }
        }
    }
}
