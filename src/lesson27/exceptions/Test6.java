package lesson27.exceptions;
import java.io.*;

public class Test6 {
    // также в одном из классов можно обработать искллючение с помощью
    // try-catch-finally и больше не использовать throws
    void abc() throws FileNotFoundException{
        File f = new File("Test9.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Hello!");
    }

    void def() throws FileNotFoundException {
        System.out.println("How are you?");
        abc();
    }

    public static void main(String[] args) throws FileNotFoundException{
        Test6 t6 = new Test6();
        t6.def();
    }
}
