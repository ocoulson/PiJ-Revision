package Calculator;

import java.util.Scanner;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class CommandLineCalculator {

    public static void main(String[] args) {
        CommandLineCalculator com = new CommandLineCalculator();

        com.run();
    }

    public void run() {
        System.out.println("Input operation: e.g. x+y or x - y");
        System.out.print("> ");

        double x = 0;
        double y = 0;
        char operator;
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Equation equation = null;
        if (input.contains(" ")) {
            String[] inputArray = input.split(" ");
            x = Double.parseDouble(inputArray[0]);
            y = Double.parseDouble(inputArray[2]);
            operator = inputArray[1].charAt(0);

            equation = new Equation(x,y,operator);
        } else {
            equation = noSpaces(input);
        }

        if (equation.getOperator() == 'z') {
            System.out.println("Invalid equation");
        } else {

            System.out.println(equation.evaluate());
        }
    }

    public Equation noSpaces(String input) {
        double x = 0;
        double y = 0;
        char operator;
        if (input.contains("+")) {
            int index = input.indexOf('+');
            x = Double.parseDouble(input.substring(0,index));
            y = Double.parseDouble(input.substring(index+1));
            operator = '+';
        } else if (input.contains("-")) {
            int index = input.indexOf('-');
            x = Double.parseDouble(input.substring(0,index));
            y = Double.parseDouble(input.substring(index+1));
            operator = '-';
        } else if (input.contains("*")) {
            int index = input.indexOf('*');
            x = Double.parseDouble(input.substring(0,index));
            y = Double.parseDouble(input.substring(index+1));
            operator = '*';
        } else if (input.contains("/")) {
            int index = input.indexOf('/');
            x = Double.parseDouble(input.substring(0,index));
            y = Double.parseDouble(input.substring(index+1));
            operator = '/';
        } else {
            return new Equation(0,0,'z');
        }
        return new Equation(x,y,operator);
    }
}
