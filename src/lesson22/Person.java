package lesson22;

public class Person {
    final String pol;
    private boolean clever;

    public boolean isClever() {
        return clever;
    }

    public void setClever(boolean clever) {
        this.clever = clever;
    }
    Person(String pol) {
        this.pol = pol;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Test{
    public static void main(String[] args) {
        Person p = new Person("male");
        p.setName("Petya");
        p.setAge(25);
        p.setWeight(65);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getWeight());
    }
}