package V1_ÖvnUppg5_Kalkylator;

public class Calculator  {
    
    protected boolean operatorSupported(String operator){
        if (operator.equalsIgnoreCase("+") || operator.equalsIgnoreCase("-") || 
                operator.equalsIgnoreCase("*") || operator.equalsIgnoreCase("/")){
            return true;
        }
        return false;
    }

    protected boolean checkDivisionByZero(double b){
        if (b == 0){
            return true;
        }
        return false;
    }
    
    public double calculate(double a, double b, String operator) throws OperatorNotSupportedException, DivisionByZeroException{
        if (!operatorSupported(operator)) {
            throw new OperatorNotSupportedException("Felaktig operator");
        }
        
        if (operator.equalsIgnoreCase("+")) return a+b;
        else if (operator.equalsIgnoreCase("-")) return a-b;
        else if (operator.equalsIgnoreCase("*")) return a*b;
        else {
            if (checkDivisionByZero(b)){
                throw new DivisionByZeroException("Inte ok att dela med noll");
            }
            return a/b;
        }
    }

}
