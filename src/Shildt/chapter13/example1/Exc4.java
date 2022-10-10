package Shildt.chapter13.example1;
//ошибочная программа
public class Exc4 {
    public static void main(String[] args) {
        int a;
        try {
            a = 0;
            int b = 134 / a;
        }
        catch(Exception e) {
            System.out.println("Деление на 0 " + e);
        }
        // этот оператор сatch вообще не будет достигнут, так как
        //ArithmeticException является производным от класса Exception
        // класс Exception перехватит все ошибки
/*        catch(ArithmeticException e) {
            System.out.println("Код не выполнится");
        }*/
    }
}
