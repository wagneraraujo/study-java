public class CurrentAccount extends Account {

    private String typeAccount;
    private double overdraft;

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public double getBalanceAvailable(){
        return super.getBalance() + overdraft;
    }

    @Override
    public void retireAccount(double value){
        value += 10 ;
        super.retireAccount(value);

    }


}
