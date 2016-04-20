package Calculator;

import java.util.Scanner;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.run();
    }

    public void run() {

        System.out.print("First number: ");
        double a = getInput();
        System.out.println();
        System.out.print("Second number: ");
        double b = getInput();

        System.out.println("Choose Operation:");
        System.out.println("Input: '+' to add, '-' to subtract, '*' to multiply or '/' to divide");

        Scanner scan = new Scanner(System.in);
        String operator = scan.nextLine();
        double result = 0;
        String resultText = "";
        switch(operator.charAt(0)) {
            case '+': result = CalculatorUtil.add(a,b);
                resultText = " plus ";
                break;
            case '-': result = CalculatorUtil.subtract(a,b);
                resultText = " minus ";
                break;
            case '*': result = CalculatorUtil.multiply(a,b);
                resultText = " times ";
                break;
            case '/': result = CalculatorUtil.divide(a,b);
                resultText = " divided by ";
                break;
        }

        System.out.println(a + resultText + b + " = " + result);

    }

    private double getInput() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        return Double.parseDouble(input);

    }
}
