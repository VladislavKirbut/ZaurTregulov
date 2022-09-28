package lesson8;

public class StaticPhone {
    private static int count;
    StaticPhone() {
        count++;
    }

    public void showInfo() {
        System.out.println("Count of phone is " + count);
    }
}

class StaticPhoneTest {
    public static void main(String[] args) {
        StaticPhone iphone = new StaticPhone();
        iphone.showInfo();
        StaticPhone android = new StaticPhone();
        android.showInfo();
    }
}
