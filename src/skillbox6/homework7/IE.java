package skillbox6.homework7;

// individual Entrepreneur
public class IE extends Client{

    public IE(double amount) {
        super(amount);
    }

    void increase(double amount) {
        if (amount <= 0) System.out.println("Enter correct amount!");
        else {
            if(amount < 1000) {
                System.out.println("Your amount < 1000, percent: 1%");
                double balance = super.getAmount() + amount - (amount / 100);
                super.setAmount(balance);
                System.out.println("Your account balance are increase successful.");
            } else {
                System.out.println("Your amount >= 1000, percent: 0.5%");
                double balance = super.getAmount() + amount - (amount * 0.5 / 100);
                super.setAmount(balance);
                System.out.println("Your account balance are increase successful.");
            }
        }
    }

    void getMoney(double amount) {
        double difference = 0;
        if(amount > 0) {

            if (amount < 1000) {
                System.out.println("Your amount < 1000, percent: 1%");
                difference = super.getAmount() - amount - (amount / 100);
            } else {
                System.out.println("Your amount >= 1000, percent: 0.5%");
                difference = super.getAmount() - amount - (amount * 0.5 / 100 );
            }

            if(difference >= 0) {
                System.out.println("Success. You get " + amount + " money.");
                super.setAmount(difference);
            } else {
                System.out.println("Your account doesn't have enough money.");
            }
        } else System.out.println("Enter correct amount.");
    }

}

class IETest {
    public static void main(String[] args) {
        IE ie = new IE(10000);
        ie.showAmount();
        ie.increase(30000);
        ie.showAmount();
        ie.getMoney(2000);
        ie.showAmount();
    }
}