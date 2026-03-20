package V1_ÖvnUppg5_Kalkylator;


public class Calculator {


    protected boolean checkDivisionByZero(double b) {
        if (b == 0) {
            return true;
        }
        return false;
    }

    public double calculate(double a, double b, String operator)
            throws OperatorNotSupportedException, DivisionByZeroException {

        return switch (operator) {
            case "+": yield a + b;
            case "-": yield a - b;
            case "*": yield a * b;
            case "/": {
                if (checkDivisionByZero(b)) {
                    throw new DivisionByZeroException("Inte ok att dela med noll");
                }
                yield a / b;
            }
            default:
                throw new OperatorNotSupportedException("Felaktig operator " + operator);
        };
    }

}
