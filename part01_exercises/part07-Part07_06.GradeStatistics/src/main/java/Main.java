
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        Averages gradeSet = new Averages();
        UserInterface userInterface = new UserInterface(gradeSet, scanner);
        
        userInterface.start();
        
    }
}
