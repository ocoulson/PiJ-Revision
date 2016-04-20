package Calculator;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class Equation {
    private final double a;
    private final double b;
    private final char operator;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public char getOperator() {
        return operator;
    }

    public Equation(double a, double b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public double evaluate() {
        double result = 0;
        switch(operator) {
            case '+': result =  CalculatorUtil.add(a,b);
                break;
            case '-': result =  CalculatorUtil.subtract(a,b);
                break;
            case '*': result =  CalculatorUtil.multiply(a,b);
                break;
            case '/': result =  CalculatorUtil.divide(a,b);
                break;
        }
        return result;
    }
}
