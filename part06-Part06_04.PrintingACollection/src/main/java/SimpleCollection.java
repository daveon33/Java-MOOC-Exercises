
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if(elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }
        
        String alphabetNow  = "";
        
        for(String letter: elements) {
            alphabetNow += letter + "\n";
        }
        
        if(elements.size() == 1) {
            return "The collection " + name + " has 1 element:" + "\n" + elements.get(0);
        }
        
        return "The collection " + name + " has " + elements.size() + " elements:" + "\n" + alphabetNow;
    }
    
}
