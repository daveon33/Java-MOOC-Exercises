
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestPerson = 0;
        
        while(true) {
            String nameAndAge = scanner.nextLine();
            
            if(nameAndAge.equals("")){
                break;
            }
            
            String[] parts = nameAndAge.split(",");
            if(Integer.valueOf(parts[1]) > oldestPerson) {
                oldestPerson = Integer.valueOf(parts[1]);
            }
        }
        
        System.out.println("Age of the oldest: " + oldestPerson);

    }
}
