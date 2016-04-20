package WordsAndLetters;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class LetterPairs {
    public static void main(String[] args) {
        LetterPairs lp = new LetterPairs();
        lp.run();
    }

    public void run() {
        System.out.println(countInstances());
    }

    public int countInstances() {
        System.out.println("Input a chunk of text");
        String mainText = TextUtil.getTextInput();

        System.out.println("Input a small string to search for");
        String shortText = TextUtil.getTextInput();

        int count = 0;

        if (shortText.length() > mainText.length()) {
            return 0;
        } else {
            for (int i = 0; i < mainText.length(); i ++) {
                if (mainText.charAt(i) == shortText.charAt(0)) {
                    boolean contained = true;
                    for(int j = 0; j < shortText.length(); j++) {
                        if (mainText.charAt(i+j) != shortText.charAt(j)) {
                            contained = false;
                            break;
                        }
                    }
                    if (contained) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
