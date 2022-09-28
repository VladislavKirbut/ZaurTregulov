package Lesson4;

class BankAccount {

    BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    int id;
    double balance;

    void popolnenieScheta(double balance) {
        this.balance += balance;
        System.out.println("Your cash is " + this.balance);
    }

    void snyatieSoScheta(double balance) {
        this.balance -= balance;
        System.out.println("Your cash is " + this.balance);
    }
}


public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, 5000);
        account1.popolnenieScheta(50);
        account1.snyatieSoScheta(70);
    }
}
