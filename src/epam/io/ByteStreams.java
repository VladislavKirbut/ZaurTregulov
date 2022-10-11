package epam.io;
import java.io.*;
import java.util.Arrays;

public class ByteStreams {
    public static void main(String[] args) {
        File f = new File("Test10.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            byte[] array = new byte[16];
            int number = fis.read(array);
            System.out.println(Arrays.toString(array));
            System.out.println("Count of number: " + number);
        }
        catch(FileNotFoundException e) {
            e.getStackTrace();
        }
        catch(IOException e) {
            e.getStackTrace();
        }
        finally {
            try {
                if(fis != null) {
                    fis.close();
                }
            }
            catch(IOException e) {
                e.getStackTrace();
            }

        }
    }
}
