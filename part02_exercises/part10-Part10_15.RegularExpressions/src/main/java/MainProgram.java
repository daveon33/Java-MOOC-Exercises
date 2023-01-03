
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner input = new Scanner(System.in);
        Checker regexChecker = new Checker();
        
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        
        boolean isCorrect = regexChecker.timeOfDay(string);
        
        if(isCorrect) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
        
        
    }
}
