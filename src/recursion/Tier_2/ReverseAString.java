package recursion.Tier_2;

/**
 * reverses the inputted string 
 */
public class ReverseAString {
    
    /**
     * reverses the inputted string value 
     * 
     * @param text string value that the user wants to reverse 
     * @return the reversed string 
     */
    public static String reverse(String text) {

        // base case
        if (text.isEmpty()) {

            return text;

        // recurssive case
        } else {

            return reverse(text.substring(1)) + text.charAt(0);

        }

    }

    public static void main(String[] args) {
     
        System.out.println(reverse("hello"));
        
    }

}
