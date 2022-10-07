package lab1;
import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {

        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите х");
        x = scanner.nextInt();
        System.out.println("Введите y");
        y = scanner.nextInt();

        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x-y);
        System.out.println(x/y);
    }
}
