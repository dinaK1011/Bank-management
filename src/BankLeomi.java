public class BankLeomi extends BankIsrael{
    public BankLeomi(CustomerBank[] getBankCustomerList){
        super(10,
                getBankCustomerList,
                30000,
                16,
                "Bank Leomi",
                220000);

    }
    @Override
    public int calculateCustomerMoney(){
        int totalCustomerMoney = sumCustomerMoney();
        setAmountOfRevenue(sumCustomerMoney() - totalCustomerMoney);
        return getAmountOfRevenue();
    }
}
