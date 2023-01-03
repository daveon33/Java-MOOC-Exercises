
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.println("First: " + containerOne);
            System.out.println("Second: " + containerTwo);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            
            if(parts[0].equals("add")) {
                containerOne.add(amount);
            }
            
            if(parts[0].equals("move")) {
                //Se verifica que el contenedor uno tenga suficiente agua.
                if(amount < 0) {
                    continue;
                }
                
                
                if(containerOne.contains() - amount < 0) {
                    containerTwo.add(containerOne.contains());
                    containerOne.remove(amount);
                    continue;
                }
                
                //Si pasa aquí es porque hay suficiente
                
                if(amount + containerTwo.contains() > 100) {
                    containerTwo.add(amount);
                    containerOne.remove(amount);
                    continue;
                }
                
                containerTwo.add(amount);
                containerOne.remove(amount);
    
            }
            
            if(parts[0].equals("remove")) {
                if(containerTwo.contains() - amount < 0) {
                    containerTwo.remove(amount);
                    continue;
                }
                
                containerTwo.remove(amount);
            }

        }
    }

}
