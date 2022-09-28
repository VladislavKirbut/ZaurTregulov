package lesson9.homework9;

// Необходимо создать 8 объектов так, чтобы в последней строке кода осталось только 2
public class CreateObject {
    public static void abc() {
        String str1 = new String("ABC"); // объект виден только в пределах своего метода
        String str2 = new String("BCD"); // объект виден только в пределах своего метода
    }
}

class CreateObjectTest {
    public static void main(String[] args) {
        CreateObject c1 = new CreateObject(); // создаём первый объект
        CreateObject.abc(); // вызываем статический метод, 2 объекта создаются и по завершении метода они уничтожаются
        CreateObject.abc(); // вызываем статический метод, 2 объекта создаются и по завершении метода они уничтожаются
        CreateObject c2 = new CreateObject(); // создаём второй объект
        CreateObject.abc(); // вызываем статический метод, 2 объекта создаются и по завершении метода они уничтожаются
    }
}

// таким образом в строке 17 у нас осталось только 2 созданных объекта