package lesson27.exceptions;
import java.io.*;
// e.getStackTrace,,, e.getMessage
public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        File f = new File("Test9.txt");
        try{
            System.out.println("Object is created.");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream is created");
            int count = 0;
            while(true) {
                sb.append(fis.read());
                count++;
                if(count == 3) {
                    break;
                }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Exception 1: " + e);
            e.getMessage();
        }
        catch(IOException e) {
            System.out.println("Exception 2: " + e);
        }
        finally{
            System.out.println("End.");
        }
    }
}
