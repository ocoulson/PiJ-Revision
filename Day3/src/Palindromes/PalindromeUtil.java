package Palindromes;

import java.util.Scanner;

/**
 * Created by Oliver Coulson on 21/04/2016.
 */
public class PalindromeUtil {

    public static String getInputString() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static String reverseText(String text) {
        String reversed = "";
        for (int i = text.length()-1; i >= 0 ; i--) {
            reversed += text.charAt(i)+"";
        }
        return reversed;
    }

    public static boolean isStrictPalindrome(String text) {
        boolean palindrome = true;
        String reversed = PalindromeUtil.reverseText(text);

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != reversed.charAt(i)) {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }

    public static boolean isRelaxedPalindrome(String text) {
        boolean palindrome = true;
        String modifiedText = "";

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                modifiedText += Character.toLowerCase(text.charAt(i))+"";
            }
        }
        return isStrictPalindrome(modifiedText);
    }

    public static String createPalindrome(String text) {
        String reversed = reverseText(text);

        return text+reversed;
    }
}
