
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String avString = scanner.nextLine();
            
            if(avString.equals("")) {
                break;
            }
            
            String[] parts = avString.split(" ");
          
            for(String part: parts) {
                if(part.contains("av")) {
                    System.out.println(part);
                }
            }
            
        }


    }
}
