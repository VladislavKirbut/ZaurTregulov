package skillbox2.booleans;

public class CoffeeMachine {
    public static void main(String[] args) {
        int moneyAmount = 180;

        int cappucinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;
        boolean canBuyAnything = false;
        boolean isMilkEnough = false;

        if(moneyAmount >= cappucinoPrice && isMilkEnough) {
            System.out.println("You need to buy cappucino.");
            canBuyAnything = true;
        }
        if(moneyAmount >= lattePrice && isMilkEnough) {
            System.out.println("You need to buy latte.");
            canBuyAnything = true;
        }
        if(moneyAmount >= espressoPrice) {
            System.out.println("You need to buy espresso.");
            canBuyAnything = true;
        }
        if(moneyAmount >= waterPrice) {
            System.out.println("You need to buy water.");
            canBuyAnything = true;
        }
        if(canBuyAnything) {
            System.out.println("You don't have enough money.");
        }
    }
}
