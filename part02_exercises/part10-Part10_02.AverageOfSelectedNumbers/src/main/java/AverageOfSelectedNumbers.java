
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> numbers = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true) {
            String number = scanner.nextLine();
            
            if(number.equals("end")) {
                break;
            }
            
            numbers.add(number);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers?");
        System.out.println("(n/p)");
        String response = scanner.nextLine();
        
        double average;
        
        if(response.equals("n")) {
            average = numbers.stream()
                    .mapToInt(num -> Integer.valueOf(num))
                    .filter(negNum -> negNum < 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("average of the negative numbers: " + average);
        } else {
            average = numbers.stream()
                    .mapToInt(num -> Integer.valueOf(num))
                    .filter(negNum -> negNum > 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("average of the positive numbers: " + average);
        }
        
        
        
        
        
        
    }
}
