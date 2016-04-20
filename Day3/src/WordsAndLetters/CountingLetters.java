package WordsAndLetters;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class CountingLetters {
    public static void main(String[] args) {
        CountingLetters c = new CountingLetters();
        c.run();
    }

    public void run() {
        String input = TextUtil.getTextInput();

        char letter = TextUtil.getLetter();

        int count = 0;
        for (int i = 0; i< input.length(); i++) {
            if (input.charAt(i)==letter) {
                count ++;
            }
        }
        System.out.println("There are " + count + " '"+letter+"'s in that text");
    }
}
