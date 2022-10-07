package lab1;

import java.util.Scanner;

public class n7 {
    public static void main(String[] args) {

        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите х");
        x = scanner.nextInt();
        System.out.println("Введите y");
        y = scanner.nextInt();

        if (x > y) {
            System.out.println(x + " is large");
        } else if (y < x) {
            {
                System.out.println(y + " is large");
            }
        } else if (y == x) {
            System.out.println("These numbers is equal ");
        }

    }
}
