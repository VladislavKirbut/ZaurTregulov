package lesson27.exceptions;
import java.io.*;

public class Test5 {
    public static void main(String[] args){
        // создание абстрактного пути к файлу
        File f = new File("Test9.txt");
        try {
            // создание потока для чтения
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Good day!");
        }
        // ловим первое исключение
        catch (FileNotFoundException e) {
            System.out.println("Exception: " + e);
        }
        // ловим второе исключение
        catch(NullPointerException n) {
            System.out.println("Exception " + n);
        }
        finally {
            System.out.println("This is finally block.");
        }
        System.out.println("This code isn't exception.");
    }
}
