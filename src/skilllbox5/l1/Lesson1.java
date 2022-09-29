package skilllbox5.l1;

public class Lesson1 {
    public static void main(String[] args) {
        // один из способовов объ€влени€ массива
        // int [] roomCounts = new int[6];
        // ќстальные 2 элемента инициализируютс€ по умолчанию 0 (в зависимости от типа данных массива)
        // roomCounts[0] = 5;
        // roomCounts[1] = 45;
        // roomCounts[2] = 34;
        // roomCounts[3] = 28;

        // второй способ объ€влени€ массива
        int [] roomCounts = {5, 45, 34, 28};

        for(int i = 0; i < roomCounts.length; i++) {
            System.out.println(roomCounts[i]);
        }

        // ссылочные типы данных также можно создать через инициализацию и конкретно указав размер массива
        // String [] colors = {"ќранжевый", "синий", "зелЄный"};


        String text = " аждый охотник желает знать, где сидит фазан";

        // метод split используетс€ дл€ разделени€ строк
        String [] words = text.split(",?\\s+");

        //÷икл forEach
        for(String longWords: words) {
            System.out.println(longWords);
        }

        System.out.println();
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
