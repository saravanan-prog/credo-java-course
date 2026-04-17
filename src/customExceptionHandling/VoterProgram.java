package customExceptionHandling;


import customErrorMessage.InvalidAgeException;
import customErrorMessage.PremException;

public class VoterProgram {
    public static void main(String[] args) {

        try{
            throw new InvalidAgeException("illegal Age");

        }
        catch(Exception e){
            System.out.println("Excetpion :::"+ e.getMessage());
        }

        try{
            throw new PremException("Prem is baD BOY");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
