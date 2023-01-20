import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void fire(int count) {
        this.employees = this.employees.subList(0, count);
    }

    public List<Employee> GetTopSalary(int count) {
        this.employees.sort((o1, o2) -> {
            if (o1.GetMonthSalary() > o2.GetMonthSalary()) {
                return -1;
            } else if(o1.GetMonthSalary() < o2.GetMonthSalary()) {
                return 1;
            }
            return 0;
        });

        return this.employees.subList(0, count);
    }

    public List<Employee> GetLowSalary(int count) {
        this.employees.sort((o1, o2) -> {
            if (o1.GetMonthSalary() > o2.GetMonthSalary()) {
                return 1;
            } else if(o1.GetMonthSalary() < o2.GetMonthSalary()) {
                return -1;
            }
            return 0;
        });

        return this.employees.subList(0, count);
    }

    public int getIncome() {
        int companyIncome = 0;

        if (!this.employees.isEmpty()) {
            for (Employee employee : this.employees) {
                companyIncome += employee.GetMonthSalary();
            }
        }
        return companyIncome;
    }

    public int GetCountOfEmployees() {
        return this.employees.size();
    }
}
