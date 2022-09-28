package SkillboxL6.Extend.homework6;

public class BankAccount {
    public double cash;

    public BankAccount(double cash) {
        this.cash = cash;
    }

    public void withdrawMoney(double cash) {
        if(this.cash >= 0) {
            if(cash >= 0) {
                double amount = this.cash - cash;
                if(amount >= 0) {
                    this.cash = amount;
                    System.out.println("Account balance: " + this.cash + "\nYou withdraw: " + cash);
                } else {
                    System.out.println("There is not enough money in the account");
                }
            } else {
                System.out.println("Error. Enter a correct amount.");
            }
        } else {
                System.out.println("Error. Your account balance: " + 0);
            }
    }

    public void increaseAmount(double amount) {
        this.cash += amount;
        System.out.println("You increase balance by: " + amount + " Your balance: " + this.cash);
    }

    public void showBalance() {
        System.out.println("Your balance: " + this.cash);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(5158.07);
        account1.increaseAmount(5700);
        account1.showBalance();
    }
}
