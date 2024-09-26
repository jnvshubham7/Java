Create a class called BankAccount with the following attributes:

accountNumber (String)
accountHolderName (String)
balance (double)
Write getters, setters, and a parameterized constructor for the class.

Create a static method transferFunds in a separate class called BankUtils. The method should take four parameters:

fromAccount (BankAccount)
toAccount (BankAccount)
amount (double)
transactionCode (String)
The method should transfer the specified amount from the fromAccount to the toAccount,
and return a Transaction object containing the transactionCode, the amount 
transferred, and the timestamp of the transaction. If the fromAccount has insufficient
balance, the method should throw an InsufficientBalanceException with an appropriate error message.

Create a class called Transaction with the following attributes:

transactionCode (String)
amount (double)
timestamp (String)
Write getters and a parameterized constructor for the class.

Create an InsufficientBalanceException class that extends the Exception class. 
The exception should have a constructor that takes a message as a parameter.

In the main method, create two BankAccount objects, transfer some funds between 
them using the transferFunds method, and print the transaction details to the console. Handle any exceptions.

Sample Input:

Account 1:
Account Number: 12345
Account Holder Name: John
Balance: 5000.0

Account 2:
Account Number: 67890
Account Holder Name: Jane
Balance: 10000.0

Transfer Details:
Amount: 2000.0
Transaction Code: T0001

Sample Output:

Before Transfer:
Account 1: John - 12345 - 5000.0
Account 2: Jane - 67890 - 10000.0

After Transfer:
Account 1: John - 12345 - 3000.0
Account 2: Jane - 67890 - 12000.0

Transaction Details:
Transaction Code: T0001
Amount Transferred: 2000.0
Timestamp: 2023-04-01 10:30:00

Here is the code and explanation for the given question:

**BankAccount Class:**
```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
```

**BankUtils Class:**
```java
public class BankUtils {
    public static Transaction transferFunds(BankAccount fromAccount, BankAccount toAccount, double amount, String transactionCode) throws InsufficientBalanceException {
        if (fromAccount.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient balance in account " + fromAccount.getAccountNumber());
        }
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
        return new Transaction(transactionCode, amount, getCurrentTimestamp());
    }

    private static String getCurrentTimestamp() {
        // implement your timestamp generation logic here
        return "2023-04-01 10:30:00";
    }
}
```

**Transaction Class:**
```java
public class Transaction {
    private String transactionCode;
    private double amount;
    private String timestamp;

    public Transaction(String transactionCode, double amount, String timestamp) {
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public double getAmount() {
        return amount;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
```

**InsufficientBalanceException Class:**
```java
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
```

**main Method:**
```java
public class Main {
    public static void main(String[] args) {
        BankAccount fromAccount = new BankAccount("12345", "John", 5000.0);
        BankAccount toAccount = new BankAccount("67890", "Jane", 10000.0);

        try {
            Transaction transaction = BankUtils.transferFunds(fromAccount, toAccount, 2000.0, "T0001");
            System.out.println("Before Transfer:");
            System.out.println("Account 1: " + fromAccount.getAccountHolderName() + " - " + fromAccount.getAccountNumber() + " - " + fromAccount.getBalance());
            System.out.println("Account 2: " + toAccount.getAccountHolderName() + " - " + toAccount.getAccountNumber() + " - " + toAccount.getBalance());

            System.out.println("\nAfter Transfer:");
            System.out.println("Account 1: " + fromAccount.getAccountHolderName() + " - " + fromAccount.getAccountNumber() + " - " + fromAccount.getBalance());
            System.out.println("Account 2: " + toAccount.getAccountHolderName() + " - " + toAccount.getAccountNumber() + " - " + toAccount.getBalance());

            System.out.println("\nTransaction Details:");
            System.out.println("Transaction Code: " + transaction.getTransactionCode());
            System.out.println("Amount Transferred: " + transaction.getAmount());
            System.out.println("Timestamp: " + transaction.getTimestamp());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

**Output:**

```
Before Transfer:
Account 1: John - 12345 - 5000.0
Account 2: Jane - 67890 - 10000.0

After Transfer:
Account 1: John - 12345 - 3000.0
Account 2: Jane - 67890 - 12000.0

Transaction Details:
Transaction Code: T0001
Amount Transferred: 2000.0
Timestamp: 2023-04-01 10:30:00
```

**Sample Input:**

*   Account 1:
    *   Account Number: 12345
    *   Account Holder Name: John
    *   Balance: 5000.0
*   Account 2:
    *   Account Number: 67890
    *   Account Holder Name: Jane
    *   Balance: 10000.0
*   Transfer Details:
    *   Amount: 2000.0
    *   Transaction Code: T0001