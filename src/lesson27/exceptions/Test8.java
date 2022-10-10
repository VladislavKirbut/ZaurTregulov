package lesson27.exceptions;
import java.io.*;
import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("");
        File file = new File("Text10.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(500);
        }
        catch(FileNotFoundException e) {
            System.out.println("Exception (FileNotFound) " + e);
        }
        catch(IOException io) {
            System.out.println("Exception (IOException) " + io);
        }
        finally {
            System.out.println("The end.");
        }
    }
}
