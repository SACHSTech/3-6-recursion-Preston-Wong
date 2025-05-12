package recursion.Tier_2;

public class PowerFunction {
    
    public static int power(int base, int exponenet) {

        // base case
        if (exponenet == 0) {

            return 1;

        // recurssive case
        } else {

            return base * power(base, exponenet -1);

        }

    }

    public static void main(String args[]) {

        System.out.println(power(2,3)); // output 8
        System.out.println(power(2,5)); // output 32

    }

}
