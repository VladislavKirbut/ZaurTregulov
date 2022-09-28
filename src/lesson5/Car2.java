package lesson5;

class Car2 {

    Car2(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    String color;
    String engine;
    int speed;

    int gaz(int speed) {
        this.speed += speed;
        return this.speed;
    }

    int tormoz(int speed) {
        this.speed -= speed;
        return this.speed;
    }

    void showInfo() {
        System.out.println("Color: " + this.color + "\nEngine: " + this.engine + "\nSpeed: " + this.speed);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 mazda = new Car2("white", "V6");
        System.out.println(mazda.color);
    }
}


