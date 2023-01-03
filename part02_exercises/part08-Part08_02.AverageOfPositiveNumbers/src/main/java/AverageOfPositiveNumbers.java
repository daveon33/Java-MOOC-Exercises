
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        double positiveNumberCount = 0;
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            
            if(number == 0 && average > 0) {
                System.out.println(average / positiveNumberCount);
                break;
            } else if (number == 0 && average <= 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            
            if(number > 0) {
                average += number;
                positiveNumberCount++;
            }     
        }

    }
}
