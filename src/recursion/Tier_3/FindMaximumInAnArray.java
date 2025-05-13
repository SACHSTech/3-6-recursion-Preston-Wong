package recursion.Tier_3;

/**
 * finds the maximum number in the array to a certain index 
 */
public class FindMaximumInAnArray {
    
    /**
     * finds the largest number in the array until a certain index 
     * 
     * @param arr array of integers
     * @param n the index value the user wants to stop chekcing at
     * @return the largest integer value 
     */
    public static int findMax(int[] arr, int n) {

        // base case
        if (n == 0) {

            return 0;

        // recursive case 
        } else {

            return Math.max(arr[n - 1], findMax(arr, n - 1));

        }

    }

    public static void main(String args[]) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};

        System.out.println(findMax(numbers, 5)); // output 5

    }

}
