package lab1;

import java.util.Scanner;

public class n8 {
    public static void main(String[] args) {

        int x;
        int y;
        int z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите х");
        x = scanner.nextInt();
        System.out.println("Введите y");
        y = scanner.nextInt();
        System.out.println("Введите z");
        z = scanner.nextInt();

        System.out.println("Sum " + (x+y+z));
        System.out.println("Average " + (x+y+z)/3);
        System.out.println("Product " + x*y*z);
        System.out.println("Min " + Math.min(x, Math.min(y, z)));
        System.out.println("Min " + Math.max(x, Math.max(y, z)));


    }
}
