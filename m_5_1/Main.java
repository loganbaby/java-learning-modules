public class Main {
    public static void main(String[] args) {
        String text = "каждый охотник желает знать, где сидит фазан";
        String[] words = text.split(",?\\s+");

        for (int i = words.length - 1; i >= 0; --i) {
            System.out.println(words[i]);
        }
    }
}
