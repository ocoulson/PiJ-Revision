/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class Primes {
    public static void main(String[] args) {


        int maybePrime = Utilities.getIntegerInput();

        boolean prime = true;
        for (int i = maybePrime-1; i > 1; i --) {
            if (maybePrime % i == 0) {
                prime = false;
            }
        }

        if (prime) {
            System.out.println(maybePrime + " is prime");
        } else {
            System.out.println(maybePrime + " is not prime");
        }
    }
}
