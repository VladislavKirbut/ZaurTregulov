package Shildt.chapter13.example1;

public class Exc8Throws {
    static void abc() throws IllegalAccessException {
        System.out.println("Тело метода abc()");
        throw new IllegalAccessException();
    }

    public static void main(String[] args) {
        try{
            abc();
        } catch(IllegalAccessException e) {
            System.out.println("Исключение перехвачено блоком catch (main)");
        }
    }
}
