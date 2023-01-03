
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
public class Box implements Packable {
    private ArrayList<Packable> items;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if(maxCapacity - item.weight() >= 0) {
            items.add(item);
            maxCapacity -= item.weight();
        }
        
    }
    
    public double weight() {
        double totalWeight = 0;
        
        for(Packable item: items) {
            totalWeight += item.weight();
        }
        
        return totalWeight;
    }
    
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg"; 
    }
    
    
}
