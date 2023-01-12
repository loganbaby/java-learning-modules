import java.util.Scanner;

public class Main {
    public static void displayParseFIO(String fio) {
        String[] parts = fio.split(" ");
        System.out.println("Name: " + parts[0]);
        System.out.println("Surname: " + parts[1]);
        System.out.println("Last name: " + parts[2]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String FIO = in.nextLine();

        displayParseFIO(FIO);
    }
}
