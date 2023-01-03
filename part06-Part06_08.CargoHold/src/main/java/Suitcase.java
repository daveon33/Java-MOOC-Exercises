
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int totalWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = totalWeight;
    }
    
    public void addItem(Item item) {
        if((maxWeight - item.getWeight()) >= 0) {
            items.add(item);
            maxWeight -= item.getWeight();
        }
        
    }
    
    public String toString() {
        int currentWeight = 0;
        
        for(Item item: items) {
            currentWeight += item.getWeight();
        }
        
        if(items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if(items.size() == 1) {
            return items.size() + " item " + "(" + currentWeight + " kg)";
        }
        return items.size() + " items " + "(" + currentWeight + " kg)";
    }
    
    public void printItems() {
        for(Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for(Item item: items) {
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if(items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = items.get(0);
        
        for(Item item: items) {
            if(item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        
        return heaviestItem;
    }
    
}
