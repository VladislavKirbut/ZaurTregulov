package zaurpart2.comparable;
import java.util.Arrays;
import java.util.Collections;


public class Test4 {
    public static void main(String[] args) {
        Animal animal1 = new Animal(24, "KKKK", true, 4);
        Animal animal2 = new Animal(31, "AAAA", true, 4);
        Animal animal3 = new Animal(21, "FFFF", true, 4);
        Animal[] array = {animal1, animal2, animal3};
        System.out.println("Before sorting: ");
        for(Animal an: array) {
            System.out.println(an);
        }
        Arrays.sort(array);
        System.out.println("After sorting: ");
        for(Animal an: array) {
            System.out.println(an);
        }
    }
}


class Animal implements Comparable<Animal> {

    int id;
    String name;
    boolean isTail;
    int paws;

    public Animal(int id, String name, boolean isTail, int paws) {
        this.id = id;
        this.name = name;
        this.isTail = isTail;
        this.paws = paws;
    }

    public int compareTo(Animal animal) {
        int res;
        if(this.id == animal.id) return 0;
        else if(this.id < animal.id) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isTail=" + isTail +
                ", paws=" + paws +
                '}';
    }
}