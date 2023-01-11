public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count = 0;
        container.count += 7843;

        System.out.println(container.count);
        System.out.println(sumDigits(container.count));
    }

    public static Integer sumDigits(Integer number)
    {
        int sum = 0;
        while (number > 1) {
            int buffer = number % 10;
            sum += buffer;
            number /= 10;
        }

        return sum;
    }
}