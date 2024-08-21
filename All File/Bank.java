public class Bank {

    private Account[] accounts;
    private int firstAvailableAcc;

    public Bank(int numAccounts) {
        this.accounts = new Account[numAccounts];
        this.firstAvailableAcc = 0;
    }

    public void add(Account account) {
        if (firstAvailableAcc == accounts.length) {
            System.out.println("Bank is full. No account added.");
            return;
        }
        this.accounts[firstAvailableAcc] = account;
        firstAvailableAcc++;
    }

    public Account find(int acctNumber) {
        for (int i = 0; i < firstAvailableAcc; i++) {
            if (accounts[i].getAccountNumber() == acctNumber) {
                return accounts[i];
            }
        }
        // Account not found, return null or handle differently
        return null;
    }

    public void data() {
        if (firstAvailableAcc == 0) {
            System.out.println("EMPTY");
            return; // Exit the method if no accounts are available
        }
        // Print account information
        for (int i = 0; i < firstAvailableAcc; i++) {
            if (accounts[i] != null) { // Check for null before accessing
                System.out.print("Account no : " + accounts[i].getAccountNumber() + " ");
                System.out.println("Balance : " + accounts[i].getBalance());
            }
        }
    }
}
