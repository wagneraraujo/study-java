import java.io.Serializable;

public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    private int bankAgency;
    private int numberAccount;
    private double balance;

    public Account(){}

    public Account(int bankAgency, int numberAccount, float balance){
        this.balance = balance;
        this.numberAccount = numberAccount;
        this.bankAgency = bankAgency;
    }

    public int getBankAgency() {
        return bankAgency;
    }

    public void setBankAgency(int bankAgency) {
        this.bankAgency = bankAgency;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //add value in account
    public void depositAccount(double value){
        this.balance += value;
    }

    //retire value in account
    public void retireAccount(double value){
        this.balance -= value;
    }

    // get balance account
    public double getBalanceAccount(){
        return this.balance;
    }

}
