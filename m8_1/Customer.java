public class Customer
{
    private final String name;
    private String phone;
    private String eMail;

    public Customer(String name, String phone, String eMail)
    {
        try {
            if (!phone.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")) {
                throw new NumberFormatException("Wrong number");
            }

            this.phone = phone;
        } catch (NumberFormatException x) {
            x.printStackTrace();
        }

        try {
            if (!eMail.matches("\n" +
                    "\n" +
                    "([A-zА-я])+([0-9\\-_\\+\\.])*([A-zА-я0-9\\-_\\+\\.])*@([A-zА-я])+([0-9\\-_\\+\\.])*([A-zА-я0-9\\-_\\+\\.])*[\\.]([A-zА-я])+\n")) {
                throw new IllegalArgumentException("Wrong email");
            }

            this.eMail = eMail;
        } catch (IllegalArgumentException x) {
            x.printStackTrace();
        }

        this.name = name;
    }

    public String toString()
    {
        return name + " - " + eMail + " - " + phone;
    }
}
