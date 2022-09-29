package skilllbox5.l4;

public class DoubleMassive {
    public static void main(String[] args) {
        int [][] studentMarks = {
                {4, 5, 1, 2, 4},
                {3, 4, 2, 4, 5, 2, 2, 3},
                {2, 3, 4, 5},
                {3, 5, 3, 2, 2, 2, 3}
        };

        for(int i = 0; i < studentMarks.length; i++) {
            System.out.println("Class " + i + " (" + studentMarks[i].length + " students)");
            System.out.println("Marks:");
            for(int j = 0; j < studentMarks[i].length; j++) {
                System.out.print(studentMarks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
