package WordsAndLetters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class CountingLettersRedux {
    public static void main(String[] args) {
        CountingLettersRedux clr = new CountingLettersRedux();
        clr.run();
    }

    public void run() {
        List<Character> chars = new ArrayList<>();
        System.out.println("Please write a text:");
        String input = TextUtil.getTextInput();
        while (true) {
            System.out.println("Which letter would you like to count now?");
            Character letter = TextUtil.getLetter();
            boolean repeated = false;
            if (chars.size() != 0){
                for (Character c: chars) {
                    if (c == letter) {
                        repeated = true;
                        break;
                    }
                }
                if (repeated) {
                    System.out.println("Repeated letter, quitting...");
                    break;
                } else {
                    chars.add(letter);
                }
            } else {
                chars.add(letter);
            }

            int count = 0;
            for (int i = 0; i< input.length(); i++) {
                if (input.charAt(i)==letter) {
                    count ++;
                }
            }
            System.out.println("There are " + count + " '"+letter+"'s in your text");

        }

    }
}
