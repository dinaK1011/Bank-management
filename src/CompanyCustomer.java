public class CompanyCustomer implements CustomerBank {
    private int id;
    private String companyName;
    private String bankName;
    private int moneyAmount;

    public CompanyCustomer(int id, String companyName, String bankName, int moneyAmount) {
        this.id = id;
        this.companyName = companyName;
        this.bankName = bankName;
        this.moneyAmount = moneyAmount;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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
