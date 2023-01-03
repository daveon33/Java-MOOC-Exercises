
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            
            if(parts[0].equals("add")) {
                if(Integer.valueOf(parts[1]) < 0) {
                    continue;
                }
                
                if(firstContainer + Integer.valueOf(parts[1]) > 100) {
                    firstContainer = 100;
                    continue;
                }
                
                firstContainer += Integer.valueOf(parts[1]);
            }
            
            if(parts[0].equals("move")) {
                if(secondContainer + Integer.valueOf(parts[1]) > 100) {
                    secondContainer = 100;
                    continue;
                }
                
                if(firstContainer - Integer.valueOf(parts[1]) < 0) {
                    secondContainer += firstContainer;
                    continue;
                }
                
                firstContainer -= Integer.valueOf(parts[1]);
                secondContainer += Integer.valueOf(parts[1]);
            
            }
            
            if(parts[0].equals("remove")) {
                if(secondContainer - Integer.valueOf(parts[1]) < 0) {
                    secondContainer = 0;
                    continue;
                }
                
                secondContainer -= Integer.valueOf(parts[1]);
            }

        }
    }

}
