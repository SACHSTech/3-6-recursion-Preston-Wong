package recursion.Tier2;

/**
 * checks if the word is a palindrome 
 */
public class CheckIfPalindrome {
    
    /**
     * checks to see if the word is a palindrome 
     * 
     * @param word the word that the user wants to check is a palindrome 
     * @return true or false depending on if the word is or isn't a palindrome 
     */
    public static boolean iSPalindrome(String word) {

        int index = word.length();

        // base case
        if (index == 0 || index == 1) {

            return true;

        } else if (word.charAt(0) != word.charAt(index - 1)) {

            return false;

        // recursive case
        } else {

            return iSPalindrome(word.substring(1, index - 1));
        }

    }

    public static void main(String[] args) {

        System.out.println(iSPalindrome("madam")); // Output: true
        System.out.println(iSPalindrome("hello")); // Output: false
        System.out.println(iSPalindrome("racecar")); // Output: true
        System.out.println(iSPalindrome("level")); // Output: true
        System.out.println(iSPalindrome("world")); // Output: false

    }

}
