package lesson18;

public class Test1 {
    public static void main(String[] args) {

        // Declaration - только объ€вл€ет массив
        int [] array1;
        String [] array2;
        double [][] array3;
        int [][] array10;
        double[] array7;

        //Allocation (распределение)
        array1 = new int[8];
        array2 = new String[3];
        array3 = new double[4][2];
        array10 = new int[3][];
        array7 = new double[2];

        //Initialization
        array2[0] = "Hello";
        array2[1] = "Bye";
        array2[2] = "Ok";

        array3[0][0] = 3.14;
        array3[2][1] = 3.14;

        double [] array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;
        array7 = array5; // ссылаетс€ на массив array5

        array3[1] = array5;
        System.out.println(array3[1][0]);
    }
}
