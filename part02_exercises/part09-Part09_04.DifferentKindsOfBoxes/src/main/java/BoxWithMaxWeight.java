
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
public class BoxWithMaxWeight extends Box {
    
    private int maxWeight;
    private ArrayList<Item> boxes;
    
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.boxes = new ArrayList<>();
    }
    
    public void add(Item item) {
        if(maxWeight - item.getWeight() >= 0) {
            boxes.add(item);
            maxWeight -= item.getWeight();
            
        }
        
    }
    
    public boolean isInBox(Item item) {
        if(boxes.contains(item)) {
            return true;
        }
        
        return false;
    }
}
