package V1_ÖvnUppg5_Kalkylator;

import java.util.List;

public class Calculator {

    private List<String> operatorList = List.of("+", "-", "*", "/");

    protected boolean operatorSupported(String operator) {
        return operatorList.contains(operator);
    }

    protected boolean checkDivisionByZero(double b) {
        if (b == 0) {
            return true;
        }
        return false;
    }

    public double calculate(double a, double b, String operator)
            throws OperatorNotSupportedException, DivisionByZeroException {
        if (!operatorSupported(operator)) {
            throw new OperatorNotSupportedException("Felaktig operator " + operator);
        }

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
                throw new DivisionByZeroException("Felaktig operator " + operator);
        }
    }

}
