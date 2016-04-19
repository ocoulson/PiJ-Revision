import java.util.Scanner;

/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class Division {

    public static void main(String[] args) {

        Division mul = new Division();

        mul.run();
    }

    private void run() {
        boolean valid = false;

        int first = Utilities.getIntegerInput();
        int second = Utilities.getIntegerInput();
        int remainder = first;
        int quotient = 1;

        while(true) {
            if (remainder - second <= 0) {
                remainder = second - remainder;
                break;
            } else {
                remainder = remainder - second;
                quotient ++;
            }
        }


        System.out.println(first + " divided by " + second + " = " + quotient + ", remainder " + remainder);
    }

}
