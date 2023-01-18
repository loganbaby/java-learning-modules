import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneMap {
    private TreeMap<String, String> phoneBook;   // @String number, @String additional info

    PhoneMap() {
        this.phoneBook = new TreeMap<>();
    }

    private void printMap(Map<String, String> map) {
        int count = 1;
        for (var key : map.keySet()) {
            System.out.println(count + ". " + key + ": " + map.get(key));
            ++count;
        }
    }

    public void FillPhoneBook() {
        Scanner in = new Scanner(System.in);

        while(true) {
            String line = in.nextLine();
            String phoneNumber = line.split("\\s")[0];

            if (line.equals("list")) {
                printMap(phoneBook);
            } else {
                if (!phoneBook.containsKey(phoneNumber)) {
                    this.phoneBook.put(phoneNumber, line.replace(phoneNumber, ""));
                    System.out.println("New phone number added");
                } else {
                    System.out.println(phoneNumber + ": " + phoneBook.get(phoneNumber));
                }
            }
        }
    }
}
