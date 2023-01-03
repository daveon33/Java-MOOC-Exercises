
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " +secondContainer.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            
            if(parts[0].equals("add")) {
                if(Integer.valueOf(parts[1]) < 0) {
                    continue;
                }
                
                firstContainer.add(Integer.valueOf(parts[1]));
            }
            
            if(parts[0].equals("move")) {
                if(firstContainer.contains() >= Integer.valueOf(parts[1])) {
                    firstContainer.remove(Integer.valueOf(parts[1]));
                    secondContainer.add(Integer.valueOf(parts[1]));
                } else {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(firstContainer.contains());
                }
                
                
            }
            
            if(parts[0].equals("remove")) {
               secondContainer.remove(Integer.valueOf(parts[1]));
            }

        }
    }

}
