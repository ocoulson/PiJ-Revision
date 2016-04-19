import java.util.ArrayList;
import java.util.List;
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
                    if (i == 0 && input.charAt(i) == '-') {
                        continue;
                    }
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

    public static List<Integer> getNumberSequence() {
        List<Integer> intList = new ArrayList<>();
        while(true) {
            int input = Utilities.getIntegerInput();
            if (input == -1) {
                break;
            }
            else if (input < 0){
                System.out.println("Please enter positive numbers or -1 to finish");
                continue;
            }
            else {
                intList.add(input);
            }
        }
        return intList;
    }
}
