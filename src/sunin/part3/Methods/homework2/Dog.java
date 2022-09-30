package sunin.part3.methods.homework2;

public class Dog {
    String name;
    String breed;
    double speed;

    public void run() {
        for (int i = 0; i < speed; i++) {
            if(i == speed - 1) {
                System.out.println("run.");
                break;
            }
            System.out.print("run, ");
        }
    }

    public String info() {
        return "Name: " + name + "\nBreed: " + breed + "\nSpeed: " + speed;
    }

    public static void main(String [] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "Jack";
        dog1.breed = "Labrador";
        dog1.speed = 5;
        dog1.run();

        dog2.name = "Malish";
        dog2.breed = "Labrador";
        dog2.speed = 7;
        System.out.println(dog2.info());
        dog2.run();
    }
}
