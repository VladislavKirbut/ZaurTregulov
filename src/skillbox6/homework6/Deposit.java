package skillbox6.homework6;
import java.util.Calendar;
public class Deposit extends BankAccount{
    private long milliseconds;
    private boolean isIncrease = false;
    private Calendar time;
    public Deposit(double accountBalance) {
        super(accountBalance);
    }

    protected void increase(double amount) {
        super.increase(amount);
        fixedTime();
    }
    // дата которая устанавливается, когда мы кладём деньги
     void fixedTime() {
        time = Calendar.getInstance();
        milliseconds  = time.getTimeInMillis();
        isIncrease = true;
    }
    // дата с которой можно выводить деньги
    long finishDate() {
            time.set(Calendar.MONTH, 11);
            return time.getTimeInMillis();
    }
    protected void getMoney(double amount) {
        if(isIncrease) {
            long finishTimeInMillis = finishDate();
            long difference = finishTimeInMillis - milliseconds;
            if(difference <= 0) {
                isIncrease = true;
                super.getMoney(amount);
            } else System.out.println("You recently increase your balance. Try again later");
        } else {
                super.getMoney(amount);
        }
    }
    public static void main(String[] args) {
        Deposit dep = new Deposit(10000);
        dep.showAmount();
        dep.getMoney(3000);
        dep.increase(10000);
        dep.showAmount();
    }
}
