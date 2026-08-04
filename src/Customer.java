public class Customer implements CustomerBank{
    private int id;
    private String firstName;
    private String lastName;
    private String bankName;
    private int creditCardNum;
    private int moneyAmount;

    public Customer(int id, String firstName, String lastName, String bankName, int creditCardNum, int moneyAmount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankName = bankName;
        this.creditCardNum = creditCardNum;
        this.moneyAmount = moneyAmount;
    }

    public void getCustomerProfile(){
        String printInfo = "%s %s Profile: \n " +
                "Bank: %s, \n " +
                "Credit card number: %d, \n " +
                "Money in the bank: %d";
        String customerInfo = String.format(printInfo, firstName, lastName, bankName, creditCardNum, moneyAmount);
        System.out.println(customerInfo);
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(int creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    @Override
    public int getMoneyAmount() {
        return moneyAmount;
    }
    @Override
    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

}
