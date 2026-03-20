package V1_ÖvnUppg5_Kalkylator;

import java.util.List;

public class Calculator {


    protected boolean checkDivisionByZero(double b) {
        if (b == 0) {
            return true;
        }
        return false;
    }

    public double calculate(double a, double b, String operator)
            throws OperatorNotSupportedException, DivisionByZeroException {

        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": {
                if (checkDivisionByZero(b)) {
                    throw new DivisionByZeroException("Inte ok att dela med noll");
                }
                return a / b;
            }
            default:
                throw new OperatorNotSupportedException("Felaktig operator " + operator);
        }
    }

}
