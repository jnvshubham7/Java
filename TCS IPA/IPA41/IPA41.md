Create a class BankAccount with the following attributes:

accountNumber - int
accountHolderName - String
balance - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - withdraw and deposit in Solution class.

withdraw method:
------------------------------------------
This method will take two input parameters - array of BankAccount objects and the account number (int) from which withdrawal 
should be done.
The method will check if the account number is present in the array of BankAccount objects.
If present, the method will then check if the balance is sufficient to withdraw the requested amount (double). If yes, it will 
deduct the amount from the account balance and return the updated balance.
If the account number is not present or the balance is not sufficient, the method should return -1.

deposit method:
--------------------------------------------
This method will take two input parameters - array of BankAccount objects and the account number (int) in which deposit should 
be done.
The method will check if the account number is present in the array of BankAccount objects.
If present, it will add the deposit amount (double) to the account balance and return the updated balance.
If the account number is not present, the method should return -1.

These above mentioned static methods should be called from the main method.

For withdraw method - The main method should print the updated balance if the returned value is greater than or equal to 0, or 
it should print "Sorry - Insufficient balance" if the returned value is -1, or it should print "Sorry - Account not found" if 
the returned value is -2.

For deposit method - The main method should print the updated balance if the returned value is greater than or equal to 0, or 
it should print "Sorry - Account not found" if the returned value is -1.

Before calling these static methods in main, a parameterized constructor in the above mentioned attribute sequence as required.

Input
------------------------
1001
Alice
5000.0
1002
Bob
10000.0
1003
Charlie
15000.0
1002
5000.0
1001
10000.0

Output
---------------------------
5000.0
15000.0


## BankAccount Class

The BankAccount class has the following attributes:

* `accountNumber`: an integer
* `accountHolderName`: a string
* `balance`: a double

And the following methods:

### Constructor
```java
public BankAccount(int accountNumber, String accountHolderName, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
}
```
### Getters
```java
public int getAccountNumber() {
    return accountNumber;
}

public String getAccountHolderName() {
    return accountHolderName;
}

public double getBalance() {
    return balance;
}
```
### Setters
```java
public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
}

public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
}

public void setBalance(double balance) {
    this.balance = balance;
}
```

## Solution Class

The Solution class has the following static methods:

### withdraw
```java
public static double withdraw(BankAccount[] accounts, int accountNumber, double amount) {
    for (BankAccount account : accounts) {
        if (account.getAccountNumber() == accountNumber) {
            if (account.getBalance() >= amount) {
                account.setBalance(account.getBalance() - amount);
                return account.getBalance();
            } else {
                return -1; // Sorry - Insufficient balance
            }
        }
    }
    return -2; // Sorry - Account not found
}
```

### deposit
```java
public static double deposit(BankAccount[] accounts, int accountNumber, double amount) {
    for (BankAccount account : accounts) {
        if (account.getAccountNumber() == accountNumber) {
            account.setBalance(account.getBalance() + amount);
            return account.getBalance();
        }
    }
    return -1; // Sorry - Account not found
}
```

## Main Method

```java
public static void main(String[] args) {
    BankAccount[] accounts = new BankAccount[3];
    
    accounts[0] = new BankAccount(1001, "Alice", 5000.0);
    accounts[1] = new BankAccount(1002, "Bob", 10000.0);
    accounts[2] = new BankAccount(1003, "Charlie", 15000.0);
    
    double balance1 = Solution.withdraw(accounts, 1002, 5000.0);
    if (balance1 >= 0) {
        System.out.println(balance1);
    } else if (balance1 == -1) {
        System.out.println("Sorry - Insufficient balance");
    } else {
        System.out.println("Sorry - Account not found");
    }
    
    double balance2 = Solution.deposit(accounts, 1001, 10000.0);
    if (balance2 >= 0) {
        System.out.println(balance2);
    } else {
        System.out.println("Sorry - Account not found");
    }
}
```

Input:

```
1001
Alice
5000.0
1002
Bob
10000.0
1003
Charlie
15000.0
1002
5000.0
1001
10000.0
```

Output:

```
5000.0
15000.0
```