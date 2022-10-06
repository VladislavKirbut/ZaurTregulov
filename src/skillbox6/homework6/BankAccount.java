package skillbox6.homework6;

public class BankAccount {
    private double accountBalance;

    public BankAccount(double balance) {
        accountBalance = balance;
    }

    protected void increase(double amount) {
        if (amount >= 0) accountBalance += amount;
        else System.out.println("Enter a correct amount!!!");
    }

    protected double getAccountBalance() {
        return accountBalance;
    }

    protected void setAccountBalance(double balance) {
        accountBalance += balance;
    }

    protected void showAmount() {
        System.out.println("Your account balance: " + accountBalance);
    }

    protected void getMoney(double amount) {
        if (accountBalance >= 0 && amount >= 0) {
            double difference = accountBalance - amount;
            if(difference >= 0) {
                accountBalance = difference;
                System.out.println("You get " + amount + " money");
            } else System.out.println("Your account balance doesn't have enough money.");
        } else System.out.println("Your account doesn't have enough money or incorrect amount.");
    }

    //send money from Akk1 to Akk2
    protected boolean send(BankAccount akk, double amount) {
        boolean result = false;
        if(this.accountBalance >= 0 && amount >= 0) {
            double difference = this.accountBalance - amount;
            if(difference >= 0) {
                akk.accountBalance += amount;
                this.accountBalance -= amount;
                result = true;
            }
        } else {
            System.out.println("ERROR");
        }
        return result;
    }

    public static void main(String[] args) {
        BankAccount bA = new BankAccount(5000);
        BankAccount bA1 = new BankAccount(10000);
        boolean b = bA1.send(bA,3000);
        System.out.println(b);
        bA.showAmount();
        bA1.showAmount();
        bA.getMoney(3000);
        bA.showAmount();
        bA.increase(10000);
        bA.showAmount();
    }
}
