public class Main {
    public static void main(String[] args) {
        Company microsoft = new Company();

        for (int i = 0; i < 180; ++i) {
            Employee operator = new Operator();
            microsoft.hire(operator);
        }  for (int i = 0; i < 80; ++i) {
            Employee manager = new Manager();
            microsoft.hire(manager);
        } for (int i = 0; i < 10; ++i) {
            microsoft.hire(new TopManager());
        }

        System.out.println("Total company salary: " + microsoft.getIncome());

        DisplayTopSalary(microsoft);
        System.out.println();
        DisplayLowSalary(microsoft);

        microsoft.fire(microsoft.GetCountOfEmployees() / 2);

        DisplayTopSalary(microsoft);
        System.out.println();
        DisplayLowSalary(microsoft);
    }

    private static void DisplayTopSalary(Company company) {
        System.out.println("Top salary:");
        for (int i = 0; i < company.GetTopSalary(2).size(); ++i) {
            System.out.println((i + 1) + ". " + company.GetTopSalary(2).get(i).GetMonthSalary());
        }
    }

    private static void DisplayLowSalary(Company company) {
        System.out.println("Low salary:");
        for (int i = 0; i < company.GetLowSalary(2).size(); ++i) {
            System.out.println((i + 1) + ". " + company.GetLowSalary(2).get(i).GetMonthSalary());
        }
    }
}
