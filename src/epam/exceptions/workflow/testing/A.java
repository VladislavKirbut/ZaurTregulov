package epam.exceptions.workflow.testing;

import java.io.FileNotFoundException;
import java.io.IOException;

public class A {
    public void help() throws IOException {
        System.out.println("HElP");
    }
    }

    class B extends A {
        public void help() throws FileNotFoundException {
            System.out.println("Hello");
        }
    }

    class Main {
        public static void main(String[] args) {
            A a = new B();
            try {
                a.help();
            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
