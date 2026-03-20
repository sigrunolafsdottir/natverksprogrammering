package V1_ÖvnUppg5_Kalkylator;


public class Calculator {


    public double calculate(double a, double b, String operator)
            throws OperatorNotSupportedException, DivisionByZeroException {

        return switch (operator) {
            case "+": yield a + b;
            case "-": yield a - b;
            case "*": yield a * b;
            case "/": {
                if (b==0) {
                    throw new DivisionByZeroException("Inte ok att dela med noll");
                }
                yield a / b;
            }
            default:
                throw new OperatorNotSupportedException("Felaktig operator " + operator);
        };
    }

}
