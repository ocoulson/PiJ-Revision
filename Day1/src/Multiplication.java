import java.util.Scanner;

/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class Multiplication {

    public static void main(String[] args) {

        Multiplication mul = new Multiplication();

        mul.run();
    }

    private void run() {
        boolean valid = false;

        int first = getInput();
        int second = getInput();
        int output = first;

        for (int i = 1; i < second; i ++) {
            output += first;
        }

        System.out.println(first + " x " + second + " = " + output);
    }

    private int getInput() {
        int first = 0;
        boolean valid = false;
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

            first = Integer.parseInt(input);
            valid = true;

        } while (!valid);
        return first;
    }
}
