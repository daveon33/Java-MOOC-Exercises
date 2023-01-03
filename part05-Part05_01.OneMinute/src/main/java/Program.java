
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer myTimer = new Timer();
        int i = 0;
        
        while(i < 362976) {
            i++;
            System.out.println(myTimer);
            myTimer.advance();
        }
        
        System.out.println(myTimer);

    }
}
