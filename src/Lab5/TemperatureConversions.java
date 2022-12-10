//n6,22
package Lab5;
import java.util.Scanner;
public class TemperatureConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose an option 1) Convert Fahrenheit to Celcius  2) Convert Celcius to Fahrenheit: ");
        int option = input.nextInt();
        if(option == 1){
            System.out.print("Please enter a temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            System.out.println("The equavalent Celcius is: " + Celsius(fahrenheit));
        }
        else if(option == 2){
            System.out.print("Please enter a temperature in Celcius: ");
            double celcius = input.nextDouble();
            System.out.println("The equavalent Fahrenheit is: " + Fahrenheit(celcius));
        }
        else{
            System.out.println("Invalid option.");
        }
    }
    public static double Celsius(double fahrenheit){
        return 5.0/ 9.0 * (fahrenheit - 32);
    }
    public static double Fahrenheit(double celcius){
        return 9.0 / 5.0 * (celcius + 32);
    }
}
