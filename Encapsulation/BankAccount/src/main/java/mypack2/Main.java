package mypack2;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountNumber("123");
        account.setBalance(1500);

        String accountNumber = account.getAccountNumber();
        double balance = account.getBalance();

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}