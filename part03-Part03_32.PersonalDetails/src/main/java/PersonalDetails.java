
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String longestName = "";
        int currentLongestName = 0;
        double sumOfYears = 0.0;
        int countOfYears = 0;
        
        while(true) {
            String nameAndYear = scanner.nextLine();
            
            if(nameAndYear.equals("")) {
                break;
            }
            
            String[] parts = nameAndYear.split(",");
            int nameLength = parts[0].length();
            
            if(nameLength > currentLongestName) {
                currentLongestName = nameLength;
                longestName = parts[0];
            }
            
            sumOfYears += Integer.valueOf(parts[1]);
            countOfYears++;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (sumOfYears / countOfYears));

    }
}
