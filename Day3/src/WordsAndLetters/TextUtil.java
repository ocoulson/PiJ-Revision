package WordsAndLetters;

import java.util.Scanner;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class TextUtil {
    public static String getTextInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input some text:\n");

        return scanner.nextLine();

    }

    public static char getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a letter:\n");

        return scanner.nextLine().charAt(0);
    }
}
