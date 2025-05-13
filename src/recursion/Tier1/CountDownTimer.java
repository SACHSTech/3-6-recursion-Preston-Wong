package recursion.Tier1;

/**
 * prints out numberes in decending order
 */
public class CountDownTimer {

    /**
     * prints out numbers in decending order
     * 
     * @param n starting point 
     */
    public static void countDown(int n) {

        // recursive case 
        if (n != 0) {

            System.out.println(n);
            countDown(n - 1);
            
        // base case
        } else {

            
        }

    }

    public static void main(String[] args) {
        countDown(5); // Output: 5 4 3 2 1
    }
}