public class Main {

    public static void main(String[] args) {
        CurrentAccount acc1 = new CurrentAccount(9024, 17796);
        SavingsAccount acc2 = new SavingsAccount(754, 6334);
        SavingsAccount acc3 = new SavingsAccount(2232, 452136);
        CurrentAccount acc4 = new CurrentAccount(500, 24513);



        Bank bank = new Bank(5);
        bank.add(acc1);
        bank.add(acc2);
        bank.add(acc3);
        bank.add(acc4);


        System.out.println(acc1);
        acc1.deposit(411);
        System.out.println(acc1);
        acc1.withdraw(336);
        acc4.withdraw(114);
        acc2.withIntrest(6.3);

        System.out.println(acc1.getBalance());
        System.out.println(bank.find(452136));
        bank.data();
    }
}
