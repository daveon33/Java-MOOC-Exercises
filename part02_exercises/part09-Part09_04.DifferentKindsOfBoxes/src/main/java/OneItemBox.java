
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class OneItemBox extends Box {
    
    private int capacity;
    private ArrayList<Item> boxForOne;
    
    public OneItemBox() {
        this.capacity = 1;
        this.boxForOne = new ArrayList<>();
    }
    
    public void add(Item item) {
        if(capacity == 1) {
            boxForOne.add(item);
            capacity = 0;
        }

    }
    
    public boolean isInBox(Item item) {
        if(boxForOne.contains(item)) {
            return true;
        }
        
        return false;
    }
    
}
