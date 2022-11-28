//n4.19.
package Lab3;
import java.util.Scanner;

public class SalesComissionCalculator {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        double value = (0.0);
        double earnings;
        int product = (0);
        int number;

        while (product < 4)
        {
            product++;

            System.out.println("SOLD #" + product + ":");
            number = input.nextInt();

            if (product == 1)
                value = value + number * 239.99;
            else if (product == 2)
                value = value + number * 129.75;
            else if (product == 3)
                value = value + number * 99.95;
            else if (product == 4)
                value = value + number * 350.89;

        }

        earnings = 0.09 * value + 200;

        String result = ("Earnings this week: $" + earnings);
        System.out.println(result);
    }
}
