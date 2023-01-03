
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> items = new ArrayList<>();
        
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if(identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String nameItem = scanner.nextLine();
            
            if(nameItem.isEmpty()) {
                break;
            }
            
            Items item = new Items(identifier, nameItem);
            
            if(items.contains(item)) {
                continue;
            }
            
            items.add(item);
        }
        
        System.out.println("==items==");
        
        for(Items item: items) {
            System.out.println(item.getIdentifier() + ": " + item.getItemName());
        }
    }
}
