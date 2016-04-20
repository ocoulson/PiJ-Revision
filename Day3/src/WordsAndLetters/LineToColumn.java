package WordsAndLetters;

import java.util.Scanner;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class LineToColumn {
    public static void main(String[] args) {
        LineToColumn l = new LineToColumn();
        l.run();
    }

    public void run() {
        String input = TextUtil.getTextInput();

        if (input.contains(" ")) {
            words(input);
        } else {
            letters(input);
        }
    }

    public void letters(String input) {

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }

    public void words(String input) {

        String[] inputArray = input.split(" ");

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }
}
