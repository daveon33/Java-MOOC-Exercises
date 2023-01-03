
import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        ArrayList<Item> items = new ArrayList<>();
        
        
        Suitcase suit1 = new Suitcase(20);
        suit1.addItem(new Item("Dildo", 10));
        suit1.addItem(new Item("Pomade", 5));
        
        System.out.println(suit1.totalWeight());
        suit1.printItems();
    }

}
