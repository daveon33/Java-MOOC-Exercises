
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String myString = scanner.nextLine();
            
            if(myString.equals("")){
                break;
            }
            
            String[] parts = myString.split(" ");
            System.out.println(parts[parts.length - 1]);
    }

    }
}
