public class Account
{
     double bal;  //The current balance
     int accnum;  //The account number


    public Account(double theBalance, int theaccnum) {
        bal = theBalance;
        accnum = theaccnum;
    }

    public void deposit(double sum)
    {
        if (sum>0)
            bal+=sum;
        else
            System.err.println("Account.deposit(...): "
                    +"cannot deposit negative amount.");
    }

    public void withdraw(double sum)
    {
        if (sum>0)
            bal-=sum;
        else
            System.err.println("Account.withdraw(...): "
                    +"cannot withdraw negative amount.");
    }

    public double getBalance()
    {
        return bal;
    }

    public double getAccountNumber()
    {
        return accnum;
    }

    public String toString()
    {
        return "Acc " + accnum + ": " + "balance = " + bal;
    }

    public final void print()
    {
        //Don't override this,
        //override the toString method
        System.out.println( toString() );
    }

}
 class CurrentAccount extends Account {

    protected double OVERDRAFT_LIMIT = -100;

    public CurrentAccount(double balance,int id) {
        super(balance,id);
    }

    @Override
    public void withdraw(double amount) {
        if (bal - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }else{
            System.out.println("insufficient funds");
        }
    }


}

class SavingsAccount extends Account {

    protected double OVERDRAFT_LIMIT = 0;
    private double intrest;

    public SavingsAccount(double balance, int id) {
        super(balance,id);
    }

    @Override
    public void withdraw(double amount) {
        if (bal - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
    }

    public void withIntrest(double intrest){
        this.intrest = intrest;
        double amount = bal + intrest*bal /100;
        System.out.println( amount );
    }


}
