//n5.16
package Lab4;
import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main (String [] args) {



        int numbers[] = new int[5];

        Scanner input = new Scanner(System.in);



        for (int i = 0; i < 5; i++){

            System.out.print("Enter a number between 1 to 30: ");

            numbers[i] = input.nextInt();

        }

        for (int i = 0; i < 5; i++){

            for (int j = 0; j < numbers[i]; j++){

                System.out.print("*");

            }

            System.out.println("");

        }

    }
}
