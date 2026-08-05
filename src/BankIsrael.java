abstract public class BankIsrael {
    private int bankId;
    private String bankName;
    private int numOfEmployees;
    private int amountOfRevenue;
    private int amountOfExpenses;
    private CustomerBank[] bankCustomerList;

    public BankIsrael(int bankId, CustomerBank[] bankCustomerList, int amountOfExpenses, int numOfEmployees, String bankName, int amountOfRevenue) {
        this.bankId = bankId;
        this.bankCustomerList = bankCustomerList;
        this.amountOfExpenses = amountOfExpenses;
        this.numOfEmployees = numOfEmployees;
        this.bankName = bankName;
        this.amountOfRevenue = amountOfRevenue;

    }

    public boolean acceptsCompanies() {
        return false;
    }

    public boolean validateCustomers() {
        if(bankCustomerList == null){
            return true;
        }
        for(CustomerBank customer : bankCustomerList) {
            if(customer instanceof CompanyCustomer && !acceptsCompanies()) {
                System.out.println("Error: " + bankName + " cannot accept Company Customers \n");
                return false;
            }
        }
        return true;
    }

    public void takePayment(CustomerBank customer, int payment){
        if(!customer.getBankName().equalsIgnoreCase(this.bankName)){
            System.out.println("This customer is not assigned to " + getBankName());
            return;
        }
        boolean isABankCustomer =  false;
        for (CustomerBank customerBank : bankCustomerList) {
            if (customerBank != null && customerBank.getId() == customer.getId()) {
                isABankCustomer = true;
                break;
            }
        }
        if(!isABankCustomer){
            System.out.println("The customer you are checked for is not in our bank's customer list");
            return;
        }
        String customerName = "";
        if(customer instanceof Customer){
            customerName = ((Customer) customer).getFirstName();
        }else if(customer instanceof CompanyCustomer) {
            customerName = ((CompanyCustomer) customer).getCompanyName();
        }
        int currentMoney = customer.getMoneyAmount();
        if(currentMoney < payment){
            System.out.println("Transaction failed, not enough money in " + customerName + "'s account");
            return;
        }
        customer.setMoneyAmount(currentMoney - payment);
        increaseRevenue(payment);
        System.out.println("Payment for " + customerName + " successfully processed");
    }

    public void increaseRevenue(int revenueToAdd){
        this.amountOfRevenue += revenueToAdd;
    }

    public int increaseExpenses(int expensesToIncrease){
        this.amountOfExpenses += expensesToIncrease;
        return expensesToIncrease;
    }

    public int calculateCustomerMoney(){

        return sumCustomerMoney();
    }

    public int sumCustomerMoney(){
        int currentMoney = 0;
        for(CustomerBank customer : bankCustomerList){
            if(customer != null) {
                currentMoney += customer.getMoneyAmount();
            }
        }
        return currentMoney;
    }

    public void printBankCalculationMoney(){
        int before = getAmountOfRevenue();
        int customersTotal = sumCustomerMoney();
        int after = calculateCustomerMoney();
        String printInfo = "*%s Calculation Summary: \n" +
                "*Revenue before: %d, \n" +
                "*Total Customers Money: %d, \n" +
                "*Revenue after: %d \n";
        String bankInfo = String.format(printInfo, getBankName(), before, customersTotal, after);
        System.out.println(bankInfo);
    }

    public CustomerBank[] getBankCustomerList() {
        return bankCustomerList;
    }

    public void setBankCustomerList(CustomerBank[] bankCustomerList) {
        this.bankCustomerList = bankCustomerList;
        validateCustomers();
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
