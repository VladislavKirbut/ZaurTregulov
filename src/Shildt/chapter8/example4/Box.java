package Shildt.chapter8.example4;

public class Box {
    private double width;
    private double height;
    private double depth;

    // конструируем клон объекта
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

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(3,2);
        BoxWeight myClone = new BoxWeight(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume myBox1 is equal " + vol);
        System.out.println("The weight of myBox1 is equal " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume myBox2 is equal " + vol);
        System.out.println("The weight of myBox2 is equal " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Volume myBox3 is equal " + vol);
        System.out.println("The weight of myBox3 is equal " + myBox3.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Volume myCube is equal " + vol);
        System.out.println("The weight of myCube is equal " + myCube.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Volume myClone is equal " + vol);
        System.out.println("The weight of myClone is equal " + myClone.weight);
        System.out.println();
    }
}