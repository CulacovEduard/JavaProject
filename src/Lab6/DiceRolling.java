//n7,17
package Lab6;
import java.util.Random;
public class DiceRolling {
    public static void main(String[] args) {

        Random randomNumbers = new Random();


        int dice1;
        int dice2;


        int frequency = 13;

        int total [] = new int [ frequency ];
        for ( int index = 0; index < frequency; index ++)
            total[index] = 0;



        int rolls = 36000000;


        for ( int t = 0; t <= rolls; t++ ) {
            dice1 = randomNumbers.nextInt(6) + 1;
            dice2 = randomNumbers.nextInt(6) + 1;
            total[dice1 + dice2]++;
        }
        System.out.println("Results after " + rolls + " rolls");
        System.out.println("-------------------------");
        System.out.println("Value\tFrequency");

        for (int sum = 2; sum < frequency; sum++ )
            System.out.printf("%d\t%d\n" , sum, total[sum]);

    }

}
