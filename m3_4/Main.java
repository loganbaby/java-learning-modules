public class Main {
    public static void displayAllAsciiCodes_RU() {
        final String ruDict = "абвгдеёжзийклмнопрстуфхцчшщьыъэюя";
        for (int charElementCode: ruDict.toCharArray()) {
            System.out.println(charElementCode);
        }
    }

    public static void displayAllAsciiCodes_ENG() {
        final String engDict = "a b c d e f g h i j k l m n o p q r s t u v w x y z ".replaceAll(" ", "");
        for (int charElementCode: engDict.toCharArray()) {
            System.out.println(charElementCode);
        }
    }

    public static void main(String[] args) {
        displayAllAsciiCodes_RU();
        System.out.println();
        displayAllAsciiCodes_ENG();
    }
}
