package recursion.Tier_1;

public class SumofNaturalNumbers {
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
