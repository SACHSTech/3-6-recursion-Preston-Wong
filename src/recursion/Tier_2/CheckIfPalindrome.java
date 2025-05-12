package recursion.Tier_2;

public class CheckIfPalindrome {
    
    public static boolean iSPalindrome(String text) {

        int index = text.length();

        // base case
        if (index == 0 || index == 1) {

            return true;

        } else if (text.charAt(0) != text.charAt(index - 1)) {

            return false;

        // recursive case
        } else {

            return iSPalindrome(text.substring(1, index - 1));
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
