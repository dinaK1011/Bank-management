public class Main {
    public static void main(String[] args) {
        Customer adi = new Customer(312,
                "Adi",
                "Ofir",
                "Bank Leomi",
                486044,
                15000);
        Customer ido = new Customer(312,
                "Ido",
                "Cohen",
                "Bank Leomi",
                486074,
                3000);

        adi.getCustomerProfile();
    }
}