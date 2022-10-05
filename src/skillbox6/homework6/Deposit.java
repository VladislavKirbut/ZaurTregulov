package skillbox6.homework6;
import java.util.Calendar;
import java.util.Date;
public class Deposit extends BankAccount{
    private long milliseconds;
    public Deposit(double accountBalance) {
        super(accountBalance);
    }

    public void increase(double amount) {
        super.increase(amount);
        fixedTime();
    }

     public void fixedTime() {
        Calendar time = Calendar.getInstance();
        milliseconds  = time.getTimeInMillis();
    }

    // Calendar.Builder - построить дату на мес€ц вперЄд (в другом методе)
    public void getMoney(double amount) {
        Calendar finishTime = Calendar.getInstance();
        long finishMillis = finishTime.getTimeInMillis();
        long difference = finishMillis - milliseconds;
        if(difference <= 0) {
            super.getMoney(amount);
        } else System.out.println("");
    }
    public static void main(String[] args) {
    }
}
