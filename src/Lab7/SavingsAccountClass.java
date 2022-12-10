//n8,6
package Lab7;

public class SavingsAccountClass {
    private static float annualIntrestRate;
    private float savingsBalance;
    private float monthlyIntrest;


    public SavingsAccountClass(float balance) {
        this.savingsBalance = balance;
    }

       public static void modifyInterestRate(float interestRate) {
        annualIntrestRate = interestRate / 100;
    }

    public void calculateMonthlyInterest() {
        monthlyIntrest = savingsBalance * annualIntrestRate / 12;
        System.out.println("The monthly intrest is: $" + monthlyIntrest);
    }


    private void calculateSavings() {
        savingsBalance += monthlyIntrest;
    }


    public void displaySavings() {
        calculateSavings();
        System.out.println("The total balance is : $ " + savingsBalance);
    }

}
