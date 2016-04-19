import java.util.Scanner;

/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class Utilities {

    public static int getIntegerInput() {
        int first = 0;
        boolean valid = true;
        while (true) {
            System.out.println("Please input a number:");
            System.out.print("> ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            for (int i = 0; i < input.length(); i++) {
                if (!Character.isDigit(input.charAt(i))) {
                    System.out.println("Not a number, try again.\n");
                    valid = false;
                    break;
                }
            }
            if (valid) {
                first = Integer.parseInt(input);
                break;
            }
        }
        return first;
    }
}
