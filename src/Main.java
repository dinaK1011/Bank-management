public class Main {
    public static void main(String[] args) {
        CustomerBank adi = new Customer(312, "Adi", "Ofir", "Bank Leomi", 486044, 15000);
        CustomerBank ido = new Customer(313, "Ido", "Cohen", "Bank Leomi", 486074, 3000);
        CustomerBank dina = new Customer(314, "Dina", "Krop", "Bank Leomi", 486094, 6200);

        CustomerBank jermy = new Customer(15, "Jermy", "Komarov", "Bank Hapoalim", 486555, 20200);
        CustomerBank alex = new Customer(17, "Alex", "Roitman", "Bank Hapoalim", 486235, 7000);
        CustomerBank sima = new Customer(22, "Sima", "Katz", "Bank Hapoalim", 486765, 450);

        CustomerBank olga = new Customer(5, "Olga", "Yafe", "Bank Discont", 486722, 1350);
        CustomerBank yossi = new Customer(7, "Yossi", "Hai", "Bank Discont", 486142, 8000);
        CustomerBank SHCorp = new CompanyCustomer(1, "SHCorp","Bank Discont",  78400);

        CustomerBank[] leomiCustomerArr = {adi, ido, dina};
        CustomerBank[] hapoalimCustomerArr = {jermy, alex, sima};
        CustomerBank[] discontCustomerArr = {olga, yossi, SHCorp};

        BankLeomi bankLeomi = new BankLeomi(leomiCustomerArr);
        BankHapoalim bankHapoalim = new BankHapoalim(hapoalimCustomerArr);
        BankDiscont bankDiscont = new BankDiscont(discontCustomerArr);

        ((Customer) jermy).getCustomerProfile();

        ((Customer) adi).getCustomerProfile();
        bankLeomi.takePayment(adi, 3600);
        ((Customer) adi).getCustomerProfile();


        bankHapoalim.takePayment(sima, 1500);
        bankDiscont.takePayment(adi, 100);
        bankDiscont.takePayment(SHCorp, 20000);

    }
}