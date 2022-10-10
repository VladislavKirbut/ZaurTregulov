package Shildt.chapter13.example1;

public class Exc7Throw {
    static void abc() {
        try {
            // генерируем исключение сами(а не программой)
            throw new NullPointerException();
        } catch(NullPointerException e) {
            System.out.println("Перехват выполнен в методе abc()");
            // генерируем исключение сами(а не программой)
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            abc();
        } catch(NullPointerException e) {
            System.out.println("Исключение перехвачено в методе main()" + e);
        }
    }
}
