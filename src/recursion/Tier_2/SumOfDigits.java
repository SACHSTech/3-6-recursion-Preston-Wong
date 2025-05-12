package recursion.Tier_2;

/**
 * sum of all the individual digits in the inputted number 
 */
public class SumOfDigits {
    
    /**
     * sums all the individual digits in the number
     * 
     * @param n number that the user wants to sum up all of its individual digits 
     * @return the sum 
     */
    public static int sumOfDigits(int n) {

        // base case
        if (n == 0) {

            return 0;

        // recurssive case 
        } else {

            return (n % 10) + sumOfDigits(n/10);

        }

    }

    public static void main(String args[]) {

        System.out.println(sumOfDigits(1234)); // output 10

    }

}
