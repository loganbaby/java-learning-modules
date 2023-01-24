import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Employee> staff = loadStaffFromFile();
        Collections.sort(staff, (Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName)));

        for (Employee employee : staff)
            System.out.println(employee.toString());
    }

    private static ArrayList<Employee> loadStaffFromFile()
    {
        ArrayList<Employee> staff = new ArrayList<>();
        try
        {
            String staffFile = "data/staff.txt";
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for(String line : lines)
            {
                String[] fragments = line.split("\t");
                if(fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }

                String dateFormat = "dd.MM.yyyy";
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        }

        catch (Exception ex) {
            ex.printStackTrace();
        }

        return staff;
    }
}
