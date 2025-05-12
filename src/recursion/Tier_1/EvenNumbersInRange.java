package recursion.Tier_1;

public class EvenNumbersInRange {
    
    public static void evenNumbers(int start, int end) {
        
        // recurssive case
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
