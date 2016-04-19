/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class Multiplication {

    public static void main(String[] args) {

        Multiplication mul = new Multiplication();

        mul.run();
    }

    private void run() {
        boolean valid = false;

        int first = Utilities.getIntegerInput();
        int second = Utilities.getIntegerInput();
        int output = first;

        for (int i = 1; i < second; i ++) {
            output += first;
        }

        System.out.println(first + " x " + second + " = " + output);
    }


}
