package skillbox4;

import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        int result = sumDigits(555);
        System.out.println(result);
    }

    public static int sumDigits(Integer number)
    {
        //@TODO: write code here
        String str = String.valueOf(number);
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            char str1 = str.charAt(i);
            sum += Integer.parseInt(String.valueOf(str1));
        }
        return sum;
    }

}
