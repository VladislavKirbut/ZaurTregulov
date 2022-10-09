package skillbox6.homework7;

abstract public class Client {
    private double amount;

    Client(double amount) {
        this.amount = amount;
    }

    abstract void increase(double amount);

    abstract void getMoney(double amount);

    void showAmount() {
        System.out.println("Your balance is equal " + this.amount);
    };

    double getAmount() {
        return this.amount;
    }

    void setAmount(double amount) {
        this.amount = amount;
    }
}
