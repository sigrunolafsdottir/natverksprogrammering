package V1_ÖvnUppg4_Kalkylator;

public class Calculator  {
    
    protected boolean operatorSupported(String operator){
        if (operator.equalsIgnoreCase("+") || operator.equalsIgnoreCase("-") || 
                operator.equalsIgnoreCase("*") || operator.equalsIgnoreCase("/")){
            return true;
        }
        return false;
    }
    
    public double calculate(double a, double b, String operator) throws OperatorNotSupportedException{
        if (!operatorSupported(operator)) {
            throw new OperatorNotSupportedException("Felaktig operator");
        }
        
        if (operator.equalsIgnoreCase("+")) return a+b;
        else if (operator.equalsIgnoreCase("-")) return a-b;
        else if (operator.equalsIgnoreCase("*")) return a*b;
        else return a/b;
    }

}
