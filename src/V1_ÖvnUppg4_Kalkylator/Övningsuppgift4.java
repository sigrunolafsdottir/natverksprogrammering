package V1_ÖvnUppg4_Kalkylator;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Övningsuppgift4 {
    
    public Övningsuppgift4(){
        Calculator calculator = new Calculator();
        double firstNumber;
        double secondNumber;
        String operator ;
        double result;
        String svar = "";

        while(true){

            System.out.println(svar + "\nSkriv ett uttryck: ");
            Scanner sc = new Scanner(System.in);
            try{
                firstNumber = sc.nextDouble();
                operator = sc.next();
                secondNumber = sc.nextDouble();
                result = calculator.calculate(firstNumber, secondNumber, operator);
                svar = "Svaret blev " +result+". " ;
            }
            catch (InputMismatchException e){
                svar = "Fel format på indata. " ;
            }
            catch (NoSuchElementException e){
                svar = "Kunde inte läsa indata. " ;
            }
            catch (OperatorNotSupportedException e){
                //svar = "Ogiltig operator. " ;
                svar += e.getMessage();
            }
        }
    }
    
    public static void main(String[] args){
        Övningsuppgift4 ö = new Övningsuppgift4();
        
    }
    
}
