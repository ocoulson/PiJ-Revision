package Palindromes;

/**
 * Created by Oliver Coulson on 21/04/2016.
 */
public class PalindromeCreator {
    public static void main(String[] args) {
        System.out.println("Input text:");
        String text = PalindromeUtil.getInputString();

        String palindrome = PalindromeUtil.createPalindrome(text);

        System.out.println("Palindrome: ");
        System.out.println(palindrome);
    }
}
