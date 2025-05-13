package recursion.Tier1;

/**
 * prints out all the even numbers in a certain range 
 */
public class EvenNumbersInRange {
    
    /**
     * prints out all the even numbers 
     * 
     * @param start the starting point of that range
     * @param end ending point of that range 
     */
    public static void evenNumbers(int start, int end) {
        
        // recursive case
        if (start <= end) {

            // checks if it's even 
            if ((start % 2) != 0) {

                System.out.println(start + 1);
                evenNumbers(start + 2, end);

            } else {

                System.out.println(start);
                evenNumbers(start + 2, end);

            }

        // base case
        } else {

        }

    }

    public static void main(String[] args) {
        evenNumbers(0,10); 
        evenNumbers(1, 10);
    }

}
