package epam.io;
import java.io.*;

public class FileReader1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Text9.txt");
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
