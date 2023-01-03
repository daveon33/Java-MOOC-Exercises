
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        
        
        for(int i = number - 1; i >= 1; i--){
            number *= i;
        }
        
        if(number == 0){
            System.out.println("Factorial: 1");
        } else {
            System.out.println("Factorial: " + number);
        }
    }
}
