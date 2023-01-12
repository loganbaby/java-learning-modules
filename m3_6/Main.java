import java.util.Scanner;

public class Main {
    private static boolean filterIndexPart(final String[] parts, int index) {
        return index < parts.length;
    }

    public static void displayParseFIO(String fio) {
        String[] parts = fio.split(" ");

        if(filterIndexPart(parts, 0)) {
            System.out.println("Name: " + parts[0]);
        } if(filterIndexPart(parts, 1)) {
            System.out.println("Surname: " + parts[1]);
        } if(filterIndexPart(parts, 2)) {
            System.out.println("Last name: " + parts[2]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String FIO = in.nextLine();

        displayParseFIO(FIO);
    }
}
