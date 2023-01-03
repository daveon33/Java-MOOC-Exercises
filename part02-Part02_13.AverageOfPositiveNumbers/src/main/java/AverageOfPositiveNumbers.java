
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0){
                if(i == 0){
                    System.out.println("Cannot calculate the average");
                    break;
                }
                
                System.out.println("Average of the numbers: " + ((double)sum / i));
                break;
            }
            
            if(number > 0){
                i++;
                sum += number;
            }
        }
    }
}
