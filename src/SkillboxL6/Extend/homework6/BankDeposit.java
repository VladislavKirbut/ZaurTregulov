package SkillboxL6.Extend.homework6;

import java.util.Date;
import java.util.Calendar;

public class BankDeposit extends BankAccount{
    public boolean deposit = false;
    public Calendar newCalendar = Calendar.getInstance();

    public BankDeposit(double cash) {
        super(cash);
    }

    public void withdrawMoney(double cash) {
        Calendar calendar = Calendar.getInstance();
        long timeNewCalendar = newCalendar.getTime().getTime();
        long timeCalendar = calendar.getTime().getTime();
        long time = timeNewCalendar - timeCalendar;
        if(time >= 0) {
            deposit = false;
        }
        if(this.cash >= 0 && !deposit ) {
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
            System.out.println("Error. Your account balance or you have deposit: " + 0);
        }
    }

    public void increaseAmount(double amount) {
        deposit = true;
        newCalendar = Calendar.getInstance();
        newCalendar.add(Calendar.MONTH, 1);
        this.cash += amount;
        System.out.println("You increase balance by: " + amount + " Your balance: " + this.cash);
    }
}

class BankDepositTest {
    public static void main(String[] args) {

        BankDeposit bd = new BankDeposit(6900);
        bd.withdrawMoney(5000);
        bd.increaseAmount(10000);
        bd.withdrawMoney(1000);
        bd.withdrawMoney(8000);
    }
}
