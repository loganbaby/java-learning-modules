import java.util.Random;

public class Operator implements Employee {
    private final int salary;

    public Operator() {
        this.salary = new Random().nextInt(115000, 140000);
    }

    @Override
    public int GetMonthSalary() {
        return this.salary;
    }
}
