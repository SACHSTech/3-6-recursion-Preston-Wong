package recursion.Tier_1;

/**
 * sums all the numbers from 0 to the inputted value
 */
public class SumofNaturalNumbers {

    /**
     * sums up all the numbers from 0 to the inputted value 
     * 
     * @param n value that you want to be summed up until 
     * @return the sum of all the numbers added together 
     */
    public static int sum(int n) {
        
        // recurssive case
        if (n != 1) {

            return n + sum(n - 1);
 
        // base case
        } else {

            return 1;

        }

    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }
}
