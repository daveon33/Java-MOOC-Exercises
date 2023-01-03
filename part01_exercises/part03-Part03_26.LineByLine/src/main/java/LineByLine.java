
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String stringToSplit = scanner.nextLine();
            
            if(stringToSplit.equals("")) {
                break;
            }
            
            String[] parts = stringToSplit.split(" ");
            
            for(String part: parts) {
                System.out.println(part);
            }
        }

    }
}
