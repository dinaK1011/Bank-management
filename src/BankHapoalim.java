public class BankHapoalim extends BankIsrael{
    public BankHapoalim(CustomerBank[] getBankCustomerList){
        super(12,
                getBankCustomerList,
                23000,
                13,
                "Bank Hapoalim",
                19700);
    }

    @Override
    public int calculateCustomerMoney(){
        int totalCustomerMoney = sumCustomerMoney();
        setAmountOfRevenue(sumCustomerMoney() + totalCustomerMoney);
        return getAmountOfRevenue();
    }
}
