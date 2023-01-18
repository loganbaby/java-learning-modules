import java.util.Random;

public class Main {
    private static int[] generateTemperature() {
        int[] rooms = new int[30];

        for (int i = 0; i < rooms.length; ++i) {
            rooms[i] = new Random().nextInt(32, 40);
        }
        return rooms;
    }

    private static int getMiddleTemperature(int[] rooms) {
        int sum = 0;
        for(int room : rooms) sum += room;

        sum /= 30;
        return sum;
    }

    private static int getCountOfHealthy(int[] rooms) {
        int count = 0;
        for(int room : rooms) if(room == 36) ++count;
        return count;
    }

    private static void printRooms(int[] rooms) {
        for (int room : rooms) System.out.print(room + " ");
    }

    public static void main(String[] args) {
        int[] patients = generateTemperature();
        printRooms(patients);
        System.out.println();

        System.out.println("Middle temperature: " + getMiddleTemperature(patients));
        System.out.println("Count of healthy patients: " + getCountOfHealthy(patients));
    }
}
