//n4.17
package Lab3;
import java.util.Scanner;

public class GasMileage {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            int miles = 0;
            int gallons = 0;
            double mpg = 0.0;
            int totalMiles = 0;
            int totalGallons = 0;
            double totalMPG = 0.0;

            System.out.print("Enter miles (-1 to quit): ");
            miles = input.nextInt();

            if (miles != -1) {
                System.out.print("Enter gallons: ");
                gallons = input.nextInt();
            }

            while (miles != -1) {
                totalMiles += miles;
                totalGallons += gallons;
                totalMPG = (double) totalMiles / totalGallons;
                mpg = (double) miles / gallons;
                System.out.printf("MPG this tankful: %.2f\n", mpg);
                System.out.printf("Total MPG: %.2f\n", totalMPG);
                System.out.print("Enter miles (-1 to quit): ");
                miles = input.nextInt();

                if (miles != -1) {
                    System.out.print("Enter gallons: ");
                    gallons = input.nextInt();
                }
            }
        }
}
