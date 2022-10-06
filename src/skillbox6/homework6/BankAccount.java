package skillbox6.homework6;

public class BankAccount {
    private static double accountBalance;

    public BankAccount(double balance) {
        accountBalance = balance;
    }

    public void increase(double amount) {
        if (amount >= 0) accountBalance += amount;
        else System.out.println("Enter a correct amount!!!");
    }

    public static double getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(double balance) {
        accountBalance += balance;
    }

    public void showAmount() {
        System.out.println("Your account balance: " + accountBalance);
    }

    public void getMoney(double amount) {
        if (accountBalance >= 0 && amount >= 0) {
            double difference = accountBalance - amount;
            if(difference >= 0) {
                accountBalance = difference;
                System.out.println("You get " + amount + " money");
            } else System.out.println("Your account balance doesn't have enough money.");
        } else System.out.println("Your account doesn't have enough money or incorrect amount.");
    }

    public static void main(String[] args) {
        BankAccount bA = new BankAccount(5000);
        bA.getMoney(3000);
        bA.showAmount();
        bA.increase(10000);
        bA.showAmount();
    }
}
