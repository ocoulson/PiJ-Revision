import java.util.Scanner;

/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class Primes {
    public static void main(String[] args) {

        boolean valid = false;

        int maybePrime = 0;
        do {
            System.out.println("Please input a number:");
            System.out.print("> ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            for (int i = 0; i < input.length(); i++) {
                if (!Character.isDigit(input.charAt(i))) {
                    System.out.println("Not a number, try again.\n");
                    continue;
                }
            }

            maybePrime = Integer.parseInt(input);
            valid = true;

        } while (!valid);
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
