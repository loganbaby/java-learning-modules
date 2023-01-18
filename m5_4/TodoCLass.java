import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TodoCLass {
    private ArrayList<String> todoList;

    TodoCLass() {
        todoList = new ArrayList<>();
    }

    private void CommandRegister(String command, String line) {
        switch (command) {
            case "add" -> {
                Pattern isStrongCondition = Pattern.compile("^add \\d+ ");
                Matcher strongConditionMatcher = isStrongCondition.matcher(line);

                if (strongConditionMatcher.find()) {
                    Pattern pattern = Pattern.compile("add \\d+ ");
                    Matcher matcher = pattern.matcher(line);
                    todoList.add(Integer.parseInt(line.split("\\s")[1]) - 1, matcher.replaceAll(""));
                } else {
                    todoList.add(line.replace("add ", ""));
                }
            }

            case "delete" -> {
                todoList.remove(Integer.parseInt(line.replace("delete ", "")) - 1);
            }

            case "edit" -> {
                int index = Integer.parseInt(line.split("\\s")[1]) - 1;

                Pattern pattern = Pattern.compile("^edit \\d+ ");
                Matcher matcher = pattern.matcher(line);
                this.todoList.set(index, matcher.replaceAll(""));
            }

            case "list" -> {
                for (int i = 0; i < this.todoList.size(); ++i) {
                    System.out.println((i + 1) + ". " + this.todoList.get(i));
                }
            }

            case "exit" -> System.exit(1);
        }
    }

    public void startTodoReport() {
        Scanner in = new Scanner(System.in);

        while(true) {
            String line = in.nextLine();
            CommandRegister(line.split("\\s")[0], line);
        }
    }
}
