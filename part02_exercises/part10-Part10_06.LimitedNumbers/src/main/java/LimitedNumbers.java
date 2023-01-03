
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true) {
            int limitedNumber = Integer.valueOf(scanner.nextLine());
            
            if(limitedNumber < 0) {
                break;
            }
            
            numbers.add(limitedNumber);
        }
        
        numbers.stream()
                .filter(num -> num > 0 && num <= 5)
                .forEach(newNum -> System.out.println(newNum));
        
    }
}
