
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestPerson = 0;
        String nameOldestPerson = "";
        
        while(true) {
            String nameAndAge = scanner.nextLine();
            
            if(nameAndAge.equals("")){
                break;
            }
            
            String[] parts = nameAndAge.split(",");
            if(Integer.valueOf(parts[1]) > oldestPerson) {
                oldestPerson = Integer.valueOf(parts[1]);
                nameOldestPerson = parts[0];
            }
        }
        
        System.out.println("Name of the oldest: " + nameOldestPerson);

    }
}
