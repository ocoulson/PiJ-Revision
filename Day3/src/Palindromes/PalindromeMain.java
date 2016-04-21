package Palindromes;

/**
 * Created by Oliver Coulson on 21/04/2016.
 */
public class PalindromeMain {
    public static void main(String[] args) {
        PalindromeMain main = new PalindromeMain();

        main.run();
    }

    public void run() {
        System.out.println("Input text string:");
        String text = PalindromeUtil.getInputString();

        boolean palindrome = PalindromeUtil.isStrictPalindrome(text);


        if(palindrome) {
            System.out.println("The text '" + text + "' is a palindrome");
        } else System.out.println("The text '" + text + "' is not a palindrome");
    }
}
