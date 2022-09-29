package skilllbox5.l3;

public class Main {
    public static void main(String[] args) {
        String text = " аждый охотник желает знать, где сидит фазан";

        String[] colors = text.split(",?\\s+");
        for(int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }
    }
}
