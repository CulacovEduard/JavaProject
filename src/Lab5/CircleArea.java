//n6.20
package Lab5;
import java.util.Scanner;
public class CircleArea {

    public static void main(String[] args)
    {
        double a;
        double c;
        System.out.println("Enter the radius: ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();

        c = areaCalc(a);
        System.out.println("Circle Area is: " + c);
    }

    public static double areaCalc(double n1) {
        double min;

        min = (n1 * n1 * 3.14);

        return min;
    }
}
