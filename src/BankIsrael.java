abstract public class BankIsrael {
    private int bankId;
    private String bankName;
    private int numOfEmployees;
    private int amountOfRevenue;
    private int amountOfExpenses;
    private Customer[] bankCustomerList;

    public BankIsrael(int bankId, Customer[] bankCustomerList, int amountOfExpenses, int numOfEmployees, String bankName, int amountOfRevenue) {
        this.bankId = bankId;
        this.bankCustomerList = bankCustomerList;
        this.amountOfExpenses = amountOfExpenses;
        this.numOfEmployees = numOfEmployees;
        this.bankName = bankName;
        this.amountOfRevenue = amountOfRevenue;
    }

    public Customer[] getBankCustomerList() {
        return bankCustomerList;
    }

    public void setBankCustomerList(Customer[] bankCustomerList) {
        this.bankCustomerList = bankCustomerList;
    }

    public int getAmountOfExpenses() {
        return amountOfExpenses;
    }

    public void setAmountOfExpenses(int amountOfExpenses) {
        this.amountOfExpenses = amountOfExpenses;
    }

    public int getAmountOfRevenue() {
        return amountOfRevenue;
    }

    public void setAmountOfRevenue(int amountOfRevenue) {
        this.amountOfRevenue = amountOfRevenue;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

}
