package lesson27.exceptions;
import java.io.*;
public class Test3 {
    public static void main(String[] args) throws Exception {
        File f = new File("test10.txt");
        // здесь клонструктор уже должен проверить существует ли такой файл или нет,
        // если нет, то он выбросит исключение FileNotFoundException.
        FileInputStream  fis = new FileInputStream(f);
        fis.read();
        // тоже самое, конструктор проверяет, есть ли такой файл или нет, если нет
        // то конструктор выбросит исключение FileNotFoundException.
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
    }
}
