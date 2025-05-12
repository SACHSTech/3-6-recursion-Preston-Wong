package recursion.Tier_1;

public class CountDownTimer {
    public static void countDown(int n) {
        // solution here

        // recurssive case 
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