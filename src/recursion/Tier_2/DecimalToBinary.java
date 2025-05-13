package recursion.Tier_2;

/**
 * converts binary to decimal 
 */
public class DecimalToBinary {
    
    /**
     * converts binary to decimal 
     * 
     * @param n is the decimal number that the user wishes to convert to decimal 
     * @return a string binary equilvanet of the number 
     */
    public static String toBinary(int n) {


        // base case
        if (n <= 0) {

            return "";

        // recurssive case
        } else {

            return (toBinary(n / 2) + (n % 2));

        }

    }

    public static void main(String args[]) {

        System.out.println(toBinary(10)); // output 1010

    }

}
