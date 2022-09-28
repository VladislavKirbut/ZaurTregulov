package lesson12;

public class Test10 {
    public static void main(String [] args) {
        int salary = 300;

/*        if(salary >= 500) {
            System.out.println("Salary doesn't less than 500");
        } else {
            System.out.println("Salary less than 500");
        }*/

        if(salary < 200) {
            System.out.println("Salary is very small!");
        } else if (salary < 400) {
            System.out.println("Salary is average!");
        } else if(salary < 600) {
            System.out.println("Salary is very big!");
        } else {
            System.out.println("Excellent salary!");
        }

    }
}
