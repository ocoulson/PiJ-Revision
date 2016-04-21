import java.util.Scanner;

/**
 * Created by Oliver Coulson on 21/04/2016.
 */
public class TextToNumber {
    public static void main(String[] args) {
        TextToNumber t = new TextToNumber();
        t.run();
    }

    public void run() {
        System.out.println("Input a number, with commas (and a period)");
        String input = getInput();

        String numberString = "";
        boolean valid = true;
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if(!Character.isDigit(character) && character != '.') {
                if (character != ',') {
                   valid = false;
                }
            } else {
                numberString += character+"";
            }
        }
        if (!valid) {
            System.out.println("Input can only contain digits, commas and periods");
        } else {
            System.out.println(numberString + " divided by 2 is " + halve(numberString));
        }

    }

    public String halve(String number) {
        String half = "";
        boolean remainder = false;
        for(int i = 0; i < number.length();i++) {
            if(number.charAt(i) == '.') {
                half += ".";
                continue;
            }
            int value = Integer.parseInt(number.charAt(i)+"");
            if (remainder) value += 10;
            if (value % 2 == 0) {
                half += value/2;
                remainder = false;
            } else {
                half += (int) (value/2);
                remainder = true;
            }
            if (i == number.length()-1 && remainder) {
                half += 5;
            }
        }

        if (half.charAt(0) == '0') half = half.substring(1);

        return half;
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
