//n4.18
package Lab3;
import java.util.Scanner;

public class CreditLimitCalculator
{
    public static void main(String[] args)
        {
            Scanner scan = new Scanner (System.in);
            {
                int account = 1;
                int balance;
                int charges;
                int credits;
                int creditLimit;
                int newBalance;

                while( account != 0 )
                {
                    System.out.println();
                    System.out.print("Input Account Number: ");
                    account = scan.nextInt();
                    System.out.print("Input Beginning Balance: ");
                    balance = scan.nextInt();
                    System.out.print("Input Total Charges: ");
                    charges = scan.nextInt();
                    System.out.print("Input Total Credits: ");
                    credits = scan.nextInt();
                    System.out.print("Input Credit Limit: ");
                    creditLimit = scan.nextInt();
                    newBalance = balance + charges - credits;
                    System.out.println("Equivalent New Balnce: " + newBalance);
                    if ( newBalance > creditLimit)
                    {
                        System.out.println("Credit Limit Exceeded");
                        break;
                    }
                }
            }
        }
}
