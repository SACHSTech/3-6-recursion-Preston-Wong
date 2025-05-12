package recursion.Tier_2;

public class SumOfDigits {
    
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
