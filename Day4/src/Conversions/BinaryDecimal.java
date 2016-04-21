package Conversions;

import Palindromes.PalindromeUtil;


/**
 * Created by Oliver Coulson on 21/04/2016.
 */
public class BinaryDecimal {
    public static void main(String[] args) {


        System.out.println(binary2decimal("101"));
        System.out.println(binary2decimal("101.1"));

        System.out.println(binary2decimal("101010001100011101.111"));

        System.out.println(binary2decimal("110010"));
        System.out.println(decimal2binary(50));



    }

    public static double power16(int exponent) {
        return power(16, exponent);
    }

    public static double power(int base, int exponent) {
        double power = base;
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            if (exponent == 1) {
                return base;
            } else {
                for (int i = 0; i < exponent-1; i++) {
                    power = power * base;
                }
            }
        } else {
            int absExp = Math.abs(exponent);
            for (int i = 0; i < absExp-1; i++) {
                power = power * base;
            }
            power = 1/power;
        }
        return power;
    }

    public static double power2(int exponent) {
        return power(2,exponent);
    }

    public static double binary2decimal(String input) {
        String[] split = null;
        if(input.contains(".")) {
            int index = input.indexOf(".");
            split = new String[2];
            split[0] = input.substring(0, index);
            split[1] = input.substring(index+1);
        }
        double output = 0;

        if (split == null) {
            output += bin2decGreaterThan0(input);

        } else {
            output += bin2decGreaterThan0(split[0]);
            output += bin2decLessThan0(split[1]);
        }

        return output;
    }

    private static double bin2decGreaterThan0(String input) {
        double output = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                output += power2((input.length()-1) - i);
            }
        }
        return output;
    }

    private static double bin2decLessThan0(String input) {
        double output = 0;
        for (int i = 0; i < input.length(); i++) {
            int exponent = 0 - (i+1);
            if (input.charAt(i) == '1') {
                output += power2(exponent);
            }
        }
        return output;
    }

    public static String decimal2binary(int input) {
        String output = "";
        while (input > 0) {
            if (input % 2 == 0) {
                output += "0";
                input = input/2;
            } else {
                output += "1";
                input = (int) (input/2);
            }
        }

        return PalindromeUtil.reverseText(output);
    }
}
