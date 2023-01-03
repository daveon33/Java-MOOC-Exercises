
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOne = 0;
        int containerTwo = 0;

        while (true) {
            System.out.println("First: " + containerOne + "/100");
            System.out.println("Second: " + containerTwo + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            
            if(parts[0].equals("add")) {
                if(Integer.valueOf(parts[1]) < 0) {
                    continue;
                }
                
                if(Integer.valueOf(parts[1]) + containerOne > 100) {
                    containerOne = 100;
                    continue;
                }
                
                containerOne += Integer.valueOf(parts[1]);
            }
            
            if(parts[0].equals("move")) {
                //Se verifica que el contenedor uno tenga suficiente agua.
                if(Integer.valueOf(parts[1]) < 0) {
                    continue;
                }
                
                
                if(containerOne - Integer.valueOf(parts[1]) < 0) {
                    containerTwo += containerOne;
                    containerOne = 0;
                    continue;
                }
                
                //Si pasa aquí es porque hay suficiente
                
                if(Integer.valueOf(parts[1]) + containerTwo > 100) {
                    containerTwo = 100;
                    containerOne -= Integer.valueOf(parts[1]);
                    continue;
                }
                
                containerTwo += Integer.valueOf(parts[1]);
                containerOne -= Integer.valueOf(parts[1]);
    
            }
            
            if(parts[0].equals("remove")) {
                if(containerTwo - Integer.valueOf(parts[1]) < 0) {
                    containerTwo = 0;
                    continue;
                }
                
                containerTwo -= Integer.valueOf(parts[1]);
            }

        }
    }

}
