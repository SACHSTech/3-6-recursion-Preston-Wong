package recursion.Tier_2;

public class ReverseAString {
    
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
