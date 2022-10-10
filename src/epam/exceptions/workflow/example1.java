package epam.exceptions.workflow;
import java.io.File;
// Почему решили сделать такое разделение на unchecked и checked?
// потому что unchecked исключения программист сам в состоянии проверить и исправить
// unchecked - проверяются компилятором
public class example1 {
    public static void main(String[] args) {
/*        int b = 0;
        if(b != 0) {
            int value = 1 / b;
        }*/


/*
        try{
            int value = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("end");
*/



 /*       int [] array = {};
        int value = array[0];*/

        Object object = null;
        object.toString();
    }
}
