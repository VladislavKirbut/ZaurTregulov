package Shildt.chapter13.example1.homeworkException;

public class Home {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
            tiger.eat("myaso");
        try{
            tiger.drink("pivo");
            try{
                tiger.drink("pivo");
            }catch(NeVodaException e) {
                e.getMessage();
            } finally {
                System.out.println("Eto inner finally block");
            }
            }catch (Exception e) {
            System.out.println(e);
        }
    }
}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String str) {
        super(str);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String str) {
        super(str);
    }
}

class Tiger {
    public void eat(String str) throws NeMyasoException {
        if (str != "myaso") throw new NeMyasoException("Tigr ne est " + str);
        else System.out.println("Tigr est myaso");
    }

    public void drink(String str) throws NeVodaException {
        if(str != "voda") throw new NeVodaException("Tigr ne pyet" + str);
        else System.out.println("Tigr pyet vodu");
    }
}
