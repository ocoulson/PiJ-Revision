package Palindromes;

/**
 * Created by Oliver Coulson on 21/04/2016.
 */
public class PalindromeRedux {
    public static void main(String[] args) {
        System.out.println("Input a string:");
        String text = PalindromeUtil.getInputString();
        if(PalindromeUtil.isStrictPalindrome(text)) {
            System.out.println("'" + text +"' is a strict palindrome");
        } else if (PalindromeUtil.isRelaxedPalindrome(text)){
            System.out.println("'" + text +"' is a relaxed palindrome");
        } else {
            System.out.println("'" + text +"' is not a palindrome");
        }

    }
}
