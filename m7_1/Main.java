import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws ParseException {
        ArrayList<Employee> staff = loadStaffFromFile();
        Collections.sort(staff, (Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName)));

//        for (Employee employee : staff)
//            System.out.println(employee.toString());

        // m7_2 solution:
        SimpleDateFormat year2017 = new SimpleDateFormat("yyyy");
        Date year2017Date = year2017.parse("2018");
        System.out.println(year2017Date.toString());

        staff.stream().filter(e -> e.getWorkStart().after(year2017Date)).max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
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
