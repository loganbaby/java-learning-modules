import com.skillbox.airport.Airport;

public class Main {
    public static void main(String[] args) {
        Cat vasya = new Cat(12, "Vasya");
        System.out.println(vasya);

        vasya.setAge(6);
        vasya.setColor(Cat.CatColor.WHITE);
        System.out.println(vasya);

        var mysya = vasya.copyCat();
        System.out.println(mysya);

        System.out.println("Count of aircrafts: " + Airport.getInstance().getAllAircrafts().size());
    }
}
