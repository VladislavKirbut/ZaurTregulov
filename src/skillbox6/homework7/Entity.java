package skillbox6.homework7;

// uridicheskoe lico
public class Entity extends Client {

    public Entity(double amount) {
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
            System.out.println("Percent: 1%");
                double difference = super.getAmount() - amount - (amount / 100);
            if(difference >= 0) {
                System.out.println("Success. You get " + amount + " money.");
                super.setAmount(difference);
            } else {
                System.out.println("Your account doesn't have enough money.");
            }
        } else System.out.println("Enter correct amount.");
    }
}

class EntityTest {
    public static void main(String[] args) {
        Entity en = new Entity(30000);
        en.showAmount();
        en.increase(50000);
        en.showAmount();
        en.getMoney(1000);
        en.showAmount();
    }
}
