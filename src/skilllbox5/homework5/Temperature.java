package skilllbox5.homework5;

import java.text.DecimalFormat;

public class Temperature {
    public static void main(String[] args) {
        int count = 0;
        float averageTemperature = 0.0f;
        final float maxTemperature = 40;
        final float minTemperature = 32;
        float [] temperatureArray = new float[30];

        System.out.println("All temperature of patient: ");
        for(int i = 0; i < temperatureArray.length; i++) {
            temperatureArray[i] = (float) ((Math.random() * (maxTemperature - minTemperature)) + minTemperature);
            averageTemperature += temperatureArray[i];
            System.out.print(temperatureArray[i] + " ");

            if(temperatureArray[i] > 36.2 && temperatureArray[i] < 36.9) {
                count++;
            }
        }
        System.out.println("\nAverage temperature is " + averageTemperature / 30);
        System.out.println("Count of healthy patient: " + count);
    }
}