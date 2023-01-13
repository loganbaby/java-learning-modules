public class PhoneFilter {
    private final String phoneNumber;

    PhoneFilter(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String convertToRightPhoneNumber() {
        String convertedNumber = null;

        try {
            convertedNumber = phoneNumber.replaceAll("[^0-9]", "");
            if(convertedNumber.length() > 11) throw new Exception("Too long number!");
        } catch (Exception x) {
            System.err.println(x.getMessage());
            System.exit(-1);
        } finally {
            assert convertedNumber != null;
            convertedNumber = "+7 " + convertedNumber.substring(1, 4) + ' ' + convertedNumber.substring(4, 7) + '-'
                    + convertedNumber.substring(7, 9) + '-' + convertedNumber.substring(9, 11);
        }

        return convertedNumber;
    }
}
