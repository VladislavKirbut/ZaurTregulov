package Shildt.chapter8.example3;

public class Box {
    double width;
    double height;
    double depth;

    //constructor
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor for create cube
    Box(double len) {
        width = height = depth = len;
    }

    // calculate volume
    double volume() {
        return width * height * depth;
    }
}

//subclass
class BoxWeight extends Box {
    double weight;

    //constructor weight
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15,34.3);
        BoxWeight myBox2 = new BoxWeight(2,3,4, 0.076);
        Box box = new Box();
        double vol;

        vol = myBox1.volume();
        System.out.println("The Volume of myBox1 is equal: " + vol);
        System.out.println("The weight of myBox1 is equal " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("The Volume of myBox2 is equal: " + vol);
        System.out.println("The weight of myBox2 is equal " + myBox2.weight);
        System.out.println();

        box = myBox1;

        vol = box.volume();
        System.out.println("The Volume of box is equal: " + vol);
        System.out.println("The weight of box is equal "); //box.weight �� ��������
        System.out.println();
    }
}