package Shildt.chapter13.example1;

public class Exc10 {
    static void abc(int number) throws MyException {
        if(number > 20)
            throw new MyException(number);
            System.out.println("OK");
    }

    public static void main(String[] args) {
        try {
            abc(30);
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}

class MyException extends Exception {
    int number = 0;

    MyException (int number) {
        this.number = number;
    }

    public String toString() {
        return "Exception [ " + number + " ]";
    }
}

