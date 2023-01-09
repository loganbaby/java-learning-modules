public class Main {
    public static void main(String[] args) {
        Cat vasya = new Cat(12, "Vasya");
        System.out.println(vasya);

        vasya.setAge(6);
        vasya.setColor(Cat.CatColor.WHITE);
        System.out.println(vasya);
    }
}
