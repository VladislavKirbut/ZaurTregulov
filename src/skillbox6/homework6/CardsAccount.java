package skillbox6.homework6;

public class CardsAccount extends BankAccount{
    CardsAccount(double amount) {
        super(amount);
    }

    protected void getMoney(double amount) {
        if (getAccountBalance() >= 0 && amount >= 0) {
            double difference = getAccountBalance() - amount - (amount * 1 / 100) ;
            if(difference >= 0) {
                setAccountBalance(difference);
                System.out.println("You get " + amount + " money + percent: " + (amount * 1 / 100));
            } else System.out.println("Your account balance doesn't have enough money.");
        } else System.out.println("Your account doesn't have enough money or incorrect amount.");
    }

    public static void main(String[] args) {
        CardsAccount cA = new CardsAccount(20000);
        CardsAccount cA1 = new CardsAccount(20000);
        cA.getMoney(10000);
        cA.showAmount();

    }
}

