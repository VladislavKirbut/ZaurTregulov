package skilllbox5.homework5;

public class Temperature {
    public static void main(String[] args) {
        int count = 0;
        float averageTemperature = 0.0f;
        float [] temperature = new float[30];
        float [] healthPatient = {};
        int health = -1;

        for(int pacientCount = 0; pacientCount < temperature.length; pacientCount++) {
            count++;
            temperature[pacientCount] = (float) (Math.random() * 8) + 32;
            String format = String.format("%.1f", temperature[pacientCount]);
            averageTemperature += Float.parseFloat(format);

            if(Float.parseFloat(format) >= 36.2 && Float.parseFloat(format) <= 36.9) {
                healthPatient[health++] = Float.parseFloat(format);
            }

            System.out.print(format + " ");
        }
        System.out.println("\n Average temperature: " + averageTemperature / count);
    }
}
