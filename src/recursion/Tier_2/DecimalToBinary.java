package recursion.Tier_2;

/**
 * converts binary to decimal 
 */
public class DecimalToBinary {
    
    /**
     * converts binary to decimal 
     * 
     * @param n is the decimal number that the user wishes to convert to decimal 
     * @return a decimal equilvanet of the number 
     */
    public static int toBinary(int n) {


        // base case
        if (n == 0) {

            return 0;

        // recurssive case
        } else {

            return ((n % 2) + 10 * toBinary(n / 2));

        }

    }

    public static void main(String args[]) {

        System.out.println(toBinary(10)); // output 1010

    }

}
