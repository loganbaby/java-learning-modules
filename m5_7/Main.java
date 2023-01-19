import java.util.*;
import java.util.stream.IntStream;

public class Main {
    private static ArrayList<String> GenerateCarsNumbers() {
        String[] chars = {"С", "М", "Т", "В", "А", "Р", "О", "Н", "Е", "У"};
        ArrayList<String> numbersArrayList = new ArrayList<>();

        IntStream.range(1, 10).forEach(   // all numbers - @range(1, 200) !increased heap!
                region -> Arrays.stream(chars).forEach(
                        letterA -> Arrays.stream(chars).forEach(
                                letterB -> Arrays.stream(chars).forEach(
                                        letterC -> IntStream.range(1, 1000).forEach(
                                                num -> numbersArrayList.add(String.format("%s %03d %s%s %03d", letterA, num, letterB, letterC, region))
                                        )
                                )
                        )
                )
        );

        return numbersArrayList;
    }

    private static void DisplayDurations(ArrayList<String> objects) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String carNumber = in.nextLine();

            long timeOfArrayList = System.currentTimeMillis();
            System.out.println(objects.contains(carNumber));
            long durationOfArrayList = System.currentTimeMillis() - timeOfArrayList;
            System.out.println("\tDuration of ArrayList: " + durationOfArrayList);

            long timeOfArrayListBinarySearch = System.currentTimeMillis();
            System.out.println(Collections.binarySearch(objects, carNumber));
            long durationOfArrayListBinarySearch = System.currentTimeMillis() - timeOfArrayListBinarySearch;
            System.out.println("\tDuration of ArrayList with binary search: " + durationOfArrayListBinarySearch);

            long timeOfTreeSet = System.currentTimeMillis();
            TreeSet<String> treeSet = new TreeSet<>(objects);
            System.out.println(treeSet.contains(carNumber));
            long durationOfTreeSet = System.currentTimeMillis() - timeOfTreeSet;
            System.out.println("\tDuration of TreeSet: " + durationOfTreeSet);

            long timeOfHashSet = System.currentTimeMillis();
            HashSet<String> hashSet = new HashSet<>(objects);
            System.out.println(hashSet.contains(carNumber));
            long durationOfHashSet = System.currentTimeMillis() - timeOfHashSet;
            System.out.println("\tDuration of HashSet: " + durationOfHashSet);
        }
    }

    public static void main(String[] args) {
        long timeOfGeneratingObjects = System.currentTimeMillis();
        var numbersObjects = GenerateCarsNumbers();
        long durationOfGeneratingObjects = System.currentTimeMillis() - timeOfGeneratingObjects;
        System.out.println("Duration of generating objects: " + durationOfGeneratingObjects);

        DisplayDurations(numbersObjects);
    }
}
