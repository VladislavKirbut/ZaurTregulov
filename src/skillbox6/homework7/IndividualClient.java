package skillbox6.homework7;

// физическое лицо
public class IndividualClient extends Client {
    public IndividualClient(double amount) {
        super(amount);
    }

    void increase(double amount) {
        if (amount <= 0) System.out.println("Enter correct amount!");
        else {
            double balance = super.getAmount() + amount;
            super.setAmount(balance);
            System.out.println("Your account balance are increase successful.");
        }
    }

    void getMoney(double amount) {
        if(amount > 0) {
            double difference = super.getAmount() - amount;
            if(difference >= 0) {
                System.out.println("Success. You get " + amount + " money.");
                super.setAmount(difference);
            } else {
                System.out.println("Your account doesn't have enough money.");
            }
        } else System.out.println("Enter correct amount.");
    }
}

class IndividualTest {
    public static void main(String[] args) {
        Client c = new IndividualClient(1000);
        c.showAmount();

        c.increase(10000);
        c.showAmount();

        c.getMoney(5000);
        c.showAmount();

        c.getMoney(5000000);
    }
}
