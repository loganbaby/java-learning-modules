import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Cat {
    private int age;
    private final String name;     // constant for object type
    private CatColor color;

    public static enum CatColor {
        WHITE,
        BLACK
    }

    private static String switchColor(CatColor color) {
        if(color == null) return "Yard";

        return switch (color) {
            case BLACK -> "Black";
            case WHITE -> "White";
        };
    }

    public Cat() {
        this.age = 0;
        this.name = "";
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void Meow() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat: Name: " + this.name + " Age: " + this.age + " Color: " + switchColor(this.color);
    }

    public void setAge(int age) { this.age = age; }

    public void setColor(CatColor color) { this.color = color; }

    public int getAge() { return this.age; }

    public String getName() { return this.name; }
}
