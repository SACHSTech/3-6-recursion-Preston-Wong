package recursion.Tier3;

/**
 * sums all the numbers in array 
 */
public class SumOfArray {
    
    /**
     * sums all the integers in the array 
     * 
     * @param arr array of integers 
     * @param n number of elements in the array that you want to sum 
     * @return the sum of all the integers in the array 
     */
    public static int sumArray(int[] arr, int n) {

        // base case 
        if (n == 0) {

            return 0;

        // recursive case 
        } else {

            return arr[n - 1] + sumArray(arr, n - 1);

        }


    }

    public static void main(String args[]) {

        int[] numbers = {4,2,3,4,7};
        System.out.println(sumArray(numbers, 4)); // output 10

    }

}
