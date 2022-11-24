package Lab2;
import java.util.Scanner;

public class Withdrawal {
    private String name;
    private double balance;

    public Withdrawal(String name, double balance) {
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public void withdrawal(double wihdrawalAmount) {

        if (wihdrawalAmount <= balance)
        {
            balance = balance - wihdrawalAmount;
        }
        else if (wihdrawalAmount > balance)
        {
            System.out.println("Witdrawal amount exceeded account balance.");
        }


    }

    public double getBalance() {
        return balance;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class WithdrawalTest {
    public static void main(String[] args) {
        Withdrawal account1 = new Withdrawal("Jane Green", 50.00);
        Withdrawal account2 = new Withdrawal("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());


        Scanner input = new Scanner(System.in);

        System.out.printf("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("Enter withdrawal amount for account1: ");
        double with = input.nextDouble();
        System.out.printf("%nwithdrawal %.2f to account2 balance%n%n", with);
        account1.withdrawal(with);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.printf("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("Enter withdrawal amount for account2: ");
        with = input.nextDouble();
        System.out.printf("%nwithdrawal %.2f to account2 balance%n%n", with);
        account2.withdrawal(with);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

    }
}



