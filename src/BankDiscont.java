public class BankDiscont extends BankIsrael{
    public BankDiscont(CustomerBank[] getBankCustomerList){
        super(11,
                getBankCustomerList,
                15000,
                9,
                "Bank Discont",
                10000);
    }

    @Override
    public boolean acceptsCompanies() {
        return true;
    }

    @Override
    public int calculateCustomerMoney(){
        int totalCustomerMoney = sumCustomerMoney();
        setAmountOfRevenue(totalCustomerMoney);
        return getAmountOfRevenue();
    }
}
