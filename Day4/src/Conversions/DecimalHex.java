package Conversions;

/**
 * Created by Oliver Coulson on 21/04/2016.
 */
public class DecimalHex {
    public static void main(String[] args) {
        //System.out.println(decimal2hex(4096));
        System.out.println(decimal2hex(100));
    }

    public static String decimal2hex(int input) {
        String output ="";
        int exponent = findSmallestExponent(input);
        System.out.println(exponent);

        int quotient = 0;

        while (exponent >= 0) {
            double power16 = BinaryDecimal.power16(exponent);
            System.out.println(power16);
            quotient = (int) (input/power16);
            System.out.println(quotient);
            output += quotient;
            input = input - (quotient * (int) power16);
            exponent--;
        }
        return output;
    }



    private static int findSmallestExponent(int input) {
        int exponent = 0;
        double power16 = BinaryDecimal.power16(exponent);
        while (power16 <= input) {
            exponent++;
            power16 = BinaryDecimal.power16(exponent);
        }
        if(power16 == input) {
            return exponent;
        } else {
            return exponent -1;
        }


    }
}
