package recursion.Tier3;

/**
 * counts the number of times a specific character appears in a string 
 */
public class CountOccurrencesOfACharacter {
    
    /**
     * counts the number of times that a specific characterr appears in a string 
     * 
     * @param s string that is being scanned 
     * @param c character that we are checking for 
     * @return the number of times that character appears in the string 
     */
    public static int countChar(String s, char c) {

        // base case
        if (s.length() == 0) {

            return 0;

        // recursive case
        } else if (s.charAt(0) == c) {

            return countChar(s.substring(1), c) + 1;

        } else {

            return countChar(s.substring(1), c);

        }
        
    }

    public static void main(String args[]) {

        System.out.println(countChar("hello", 'l')); // output 2

    }

}
