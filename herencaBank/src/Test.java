import static java.lang.System.out;

public class Test {
    public static void main(String[] args){
        CurrentAccount cc = new CurrentAccount();
        cc.setBankAgency(1212);
        cc.setNumberAccount(12547896);
        cc.setTypeAccount("PF");
        cc.setOverdraft(100);
        cc.depositAccount(100);
        cc.retireAccount(20);


        Account accountUser = new Account();
        accountUser.depositAccount(100);
        accountUser.retireAccount(20);




        out.println("Your balance is with overdraft:" + cc.getBalanceAvailable());
        out.println("Your balance is with :" + accountUser.getBalance());
        out.println("===========================");





    }
}
