import java.util.Random;

public class TopManager extends Company implements Employee {
    private int salary;

    public TopManager() {
        this.salary = new Random().nextInt(115000, 140000);

        if (this.getIncome() > 10000000) {
            this.salary += this.salary * 1.5;
        }
    }

    @Override
    public int GetMonthSalary() {
        return this.salary;
    }
}
