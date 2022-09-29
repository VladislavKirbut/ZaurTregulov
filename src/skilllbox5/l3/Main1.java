package skilllbox5.l3;

public class Main1 {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String [] colors = text.split(",?\\s+");
        for(int colorIndex = 0; colorIndex < colors.length; colorIndex++) {
            // проверяет, чтобы подряд не было двух повторяющихся слов (если есть выводит одно)
            if (colorIndex > 0 && colors[colorIndex].equals(colors[colorIndex - 1])) {
                continue;
            }
            System.out.println(colors[colorIndex]);
        }
    }
}
