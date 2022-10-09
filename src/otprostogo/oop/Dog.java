package otprostogo.oop;

public class Dog {
    private static int dogsCount;
    private int paws;
    private int tail = 1;
    private String name;
    private String breed;

    public Dog() {
        dogsCount++;
        System.out.println("Dogs count is " + dogsCount);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size.equalsIgnoreCase("Small") || size.equalsIgnoreCase("Average") || size.equalsIgnoreCase("Big")) {
            this.size = size;
        } else {
            System.out.println("Size should be one of these: Big, Average or Small");
        }
    }

    private String size;

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setPaws(int paws) {
        if(paws == 4) {
            this.paws = paws;
        } else {
            this.paws = 4;
            System.out.println("User tried to assign " + paws + " paws for a dog");
            System.out.println("Correct number is 4");
        }

    }

    public int getPaws() {
        return paws;
    }

    public void setTail(int tail) {
        if(tail == 1) {
            this.tail = tail;
        } else {
            this.tail = 1;
            System.out.println("User tried to assign " + tail + " paws for a dog");
            System.out.println("Correct number is 1");
        }
    }

    public int getTail() {
        return tail;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public void bark() {
        // вызываем метод на строке, чтобы избежать исключения nullPointerException
        // т.к. если не будет указано значение в поле size, то для объекта поле
        // size будет null, а метод на объекте null генерирует NullPointerException
        if("Big".equalsIgnoreCase(size)) {
            System.out.println("Wof - Wof");
        }
        // тоже самое, что и в коменте выше
        else if("Average".equalsIgnoreCase(size)) {
            System.out.println("Raf - Raf");
        }
        else {
            System.out.println("Tiaf - Tiaf");
        }
    }

    public void bite() {
        if(dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }
    }
}
