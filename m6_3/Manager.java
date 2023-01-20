import java.util.Random;

public class Manager implements Employee {
    private int salary;

    public Manager() {
        this.salary = new Random().nextInt(115000, 140000);
        this.salary += this.salary * 0.05;
    }

    @Override
    public int GetMonthSalary() {
        return this.salary;
    }
}
