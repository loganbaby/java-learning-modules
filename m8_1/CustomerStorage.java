import java.util.HashMap;

public class CustomerStorage
{
    private final HashMap<String, Customer> storage;

    public CustomerStorage()
    {
        storage = new HashMap<>();
    }

    public void addCustomer(String data)
    {
        String[] components = data.split("\\s+");
        String name = components[0] + " " + components[1];
        storage.put(name, new Customer(name, components[3], components[2]));
    }

    public void listCustomers()
    {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name)
    {
        try {
            if (storage.containsKey(name)) throw new RuntimeException("Customer not found");
            storage.remove(name);
        } catch (RuntimeException x) {
            x.printStackTrace();
        }
    }

    public int getCount()
    {
        return storage.size();
    }
}