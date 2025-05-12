package recursion.Tier_2;

public class DecimalToBinary {
    
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
