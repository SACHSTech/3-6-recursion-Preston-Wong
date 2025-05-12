package recursion.Tier_3;

/**
 * sums all the numbers in array 
 */
public class SumOfArray {
    
    /**
     * sums all the integers in the array 
     * 
     * @param arr array of integers 
     * @param n current index of the array that we are checking
     * @return the sum of all the integers in the array 
     */
    public static int sumArray(int[] arr, int n) {

        // base case 
        if (n == arr.length) {

            return 0;

        // recurssive case 
        } else {

            return arr[n] + sumArray(arr, n + 1);

        }


    }

    public static void main(String args[]) {

        int[] numbers = {1,2,3,4};
        System.out.println(sumArray(numbers, 0)); // output 10

    }

}
