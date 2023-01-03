
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class ShoppingCart {
    private List<Item> items;
    
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }
    
    public void add(String product, int price) {
        for(Item item: items) {
            if(item.equals(new Item(product, 1, price))) {
                item.increaseQuantity();
                return;
            }
        }
        
        items.add(new Item(product, 1, price));
    }
    
    public int price() {
        int totalPrice = 0;
        
        for(Item item: items) {
            totalPrice += item.price();
        }
        
        return totalPrice;
    }
    
    public void print() {
        for(Item item: items) {
            System.out.println(item.toString());
        }
    }
    
    
    
    
}
